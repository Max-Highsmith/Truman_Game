import java.util.ArrayList;
import java.util.Random;

/**Locations which a player can be in
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */

public class Location 
{

	/**name of Location */
	private String name;
	
	/**description of Location */
	private String description;
	
	
	/** Monsters in current Location */
	private ArrayList<Monster> monsters;
	
	/**Items in current Location */
	private ArrayList<Item> items;
	
	/** Locations in current Location */
	protected ArrayList<Location> locations;
	
	/** Location which conains this location 
	 * default parentLocation set to self*/
	private Location parentLocation = this;
	
	
	/**Has Weather */
	private boolean hasWeather = false; 
	
	/**The weather*/
	public String weather;
	
	/**
	 * 
	 * @param aname name of location 
	 * @param adescription description of location
	 * @param m ArrayList of monsters in this location
	 * @param i ArrayList of items in this location
	 * @param l ArrayList of locations within this location
	 */
	public Location(String aname, String adescription, ArrayList<Monster> m, ArrayList<Item> i, ArrayList<Location> l)
	{
		description = adescription;
		
		name = aname;
		
		if(m != null)
			monsters = m;
		else
			monsters = new ArrayList<Monster>();
		
		if(i!= null)
			items = i;
		else
			items = new ArrayList<Item>();
		
		if(l!= null)
		{
			locations = l;
		}
		else
			locations = new ArrayList<Location>();
	}
	
	

	
	/** Accesors
	 * 
	 */
	
	/**
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return name
	 */
	public String toString()
	{
		return name;
	}
	
	/**
	 * 
	 * @param l location to be assigned as parent location
	 */
	public void setParentLocation(Location l)
	{
		parentLocation = l;
	}
	
	/**
	 * 
	 * @return parentLocation  the location containing this location
	 */
	public Location getParentLocation()
	{
		return parentLocation;
	}
	

	/**
	 * Causes Location to have weather
	 */
	public void giveWeather()
	{
		hasWeather = true;
	}
	
	/**
	 * tells locations in ArrayList<Location> locations that this location is there parent
	 */
	public void tellChildrenLocationsYouAreParent()
	{
		for(Location temp: locations)
		{
				temp.setParentLocation(this);
		}
	}
	
	/**
	 * prepares room for character by updating children locations and displaying rooms contents
	 * @param main_character the main character
	 */
	public void beEnteredForTheFirstTime(Main_Character main_character)
	{
		tellChildrenLocationsYouAreParent();
		displayContents(main_character);
		recieveInstruction(main_character);
	}

	
	/**
	 *  Method that shows Character the options available in location
	 * @param main_character the main character
	 */
	public void displayContents(Main_Character main_character)
	{
		if(hasWeather)
		generateWeather(main_character);
		
		
		main_character.recieveMessage(Descriptions.UPONENTER + name +','+ description);
		
		if(!items.isEmpty())
		main_character.recieveMessage(name+Descriptions.ITEMSINSIDE+ items);
		
		if(!monsters.isEmpty())
		main_character.recieveMessage(name+Descriptions.MONSTERSINSIDE+ monsters);
		
		if(!locations.isEmpty())
		main_character.recieveMessage(name+Descriptions.LOCATIONSINSIDE+ locations);
	}
	

	/**
	 * calls on player to enter and instruction and 
	 * determines what nature of instruction is being called
	 * 
	 * @param main_character  the main character
	 */
	public void recieveInstruction(Main_Character main_character)
	{
		String input = main_character.gatherMessage();
		boolean messageUnderstood = false;
		
		//BLANKBUFFER is used to prevent error in parsing a string that is to short
		if((input+ Descriptions.BLANKBUFFER).substring(0, 5).equals(Descriptions.ENTERLOCATIONCOMMAND))
		{
			messageUnderstood = true;
			enterInstruction(main_character,input.substring(5));
		}

		if((input+ Descriptions.BLANKBUFFER).substring(0, 7).equals(Descriptions.EXAMINECOMMAND))
		{
			messageUnderstood = true;
			examineInstruction(main_character,(input.substring(7)));
		}
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,7).equals(Descriptions.TALKCOMMAND))
		{
			messageUnderstood = true;
			talkInstruction(main_character, input.substring(7));
		}		
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,4).equals(Descriptions.EXIT))
		{
			messageUnderstood = true;
			exitInstruction(main_character);
		}
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,4).equals(Descriptions.HELP))
		{
			messageUnderstood = true;
			explainOptions(main_character);
		}
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,20).equals(Descriptions.OBSERVE))
		{
			messageUnderstood = true;
			displayContents(main_character);
			
		}
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,9).equals(Descriptions.INVENTORY))
		{
			messageUnderstood = true;
			main_character.displayInventory();
		}
		
		if((input+ Descriptions.BLANKBUFFER).substring(0,8).equals(Descriptions.GRADUATE))
		{
			messageUnderstood = true;
			main_character.graduate();
		}
		
		if(!messageUnderstood)
		{
			main_character.recieveMessage(Descriptions.MISUNDERSTOODCOMMAND);
		}
		

		
				
	}
	
	
	/**
	 * causes character to begin interaction with a specific monster
	 * 
	 * @param main_character the main character
	 * @param command string containing identify info for whomever the main character wishes to speak with
	 */
	public void talkInstruction(Main_Character main_character, String command)
	{
		for(int i =0; i <monsters.size(); i++)
		{
			if(monsters.get(i).getName().equals(command))
			{
				monsters.get(i).interact(main_character);
			}
		}
	}
	
	
	/**
	 * check If character can enter room and if so causes them to enter said room
	 * 
	 * @param main_character the main character
	 * @param command string containing identifying info on room the main character wishes to enter
	 */
	public void enterInstruction(Main_Character main_character, String command)
	{
		for(int i =0; i <locations.size(); i++)
		{
			if(locations.get(i).getName().equals(command))
			{
				if(!(locations.get(i) instanceof Room))
					main_character.enterLocation(locations.get(i));
				else
				{
					//if permited to enter
					if (((Room) locations.get(i)).determineIfEnterable(main_character))
					{
						main_character.enterLocation(locations.get(i));
					}
					else
					{
						main_character.recieveMessage(Descriptions.RESTRICTEDENTRY + ((Room) locations.get(i)).getEntryRequirement());
					}
				}
					

			}
		}
		
	}
	
	
	/**
	 * finds the item requested in items 
	 * @param main_character the main character
	 * @param command string containing identifying info for object the main character wishes to examine
	 */
	public void examineInstruction(Main_Character main_character, String command)
	{
		for(int i =0; i <items.size(); i++)
		{
			if(items.get(i).getName().equals(command))
			{
				examineItem(main_character, i);
			}
		}
	}
	
	
	/**Causes character to enter the current locations parent location
	 * @param main_character the main character
	 */
	public void exitInstruction(Main_Character main_character)
	{
		main_character.enterLocation(main_character.getCurrentLocation().getParentLocation());
	}
	
	
	/**
	 * Displays information on what commands can be performed at this point in the game
	 * @param main_character the main character
	 */
	public void explainOptions(Main_Character main_character)
	{
		
		if(!items.isEmpty())
		main_character.recieveMessage(Descriptions.ITEMINSTRUCTIONS);
		
		if(!monsters.isEmpty())
		main_character.recieveMessage(Descriptions.MONSTERINSTRUCTIONS);
			
		if(!locations.isEmpty())
	    main_character.recieveMessage(Descriptions.LOCATIONINSTRUCTIONS);
	
		if(!this.equals(this.getParentLocation()))
		main_character.recieveMessage(Descriptions.EXITINSTRUCTIONS);
		
		main_character.recieveMessage(Descriptions.OBSERVEINSTRUCTIONS);
		
		main_character.recieveMessage(Descriptions.INVENTORYINSTRUCTIONS);
	}
	
	
	/**Begins interaction with a monster
	 * 
	 * @param main_character  the main character
	 * @param i iterator identifying which monster in monsters to interact with
	 */
	public void interactWithMonster(Main_Character main_character, int i)
	{
		monsters.get(i).interact(main_character);
	}
	
	/**
	 * Cause main character to examine item
	 * 
	 * @param main_character the main character
	 * @param i iterator identifying which item in items to examine
	 */
	public void examineItem(Main_Character main_character, int i)
	{
		items.get(i).beExamined(main_character, this, i);
	}
	
	/**
	 * removes item indexed by int i from items
	 * @param i iterator identifying which item to remove
	 */
	public void removeItem(int i)
	{
		items.remove(i);
	}

	/**
	 * sends character a random weather condition
	 * @param main_character the main character
	 */
	private void generateWeather(Main_Character main_character)
	{
		Random random = new Random();
		int x = random.nextInt(100);
		if (x<50)
		{
			weather = "It's sunny outside";
		}
		if(x>=50 && x <75)
		{
			weather = "Its raining...";

		}
		if(x>75 && x <99)
		{
			weather = "Its snowing outside!";
		}
		if(x == 99)
		{
			weather = "Oh no a meteor shower";
		}
		
		main_character.recieveMessage(weather);
		
	}
	
	
}
