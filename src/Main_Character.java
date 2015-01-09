
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main character who explores game universe
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public class Main_Character 
{
	/**  Reads input from player through terminal */
	Scanner scanner =new Scanner(System.in);
	
	/** location character is currently in */
	Location currentLocation;
	
	/** tells if character just entered his current location */
	private boolean firstTimeEntering = true;
	
	/**ArrayList of knowledge character has acquired*/
	ArrayList<Knowledge> knowledgeOwned = new ArrayList<Knowledge>();
	
	/**ArrayList of key items character has acquired */
	ArrayList<Key_Item> keyItemsOwned = new ArrayList<Key_Item>();
	
	/** ArrayList of quest items character has acquired */
	ArrayList<Quest_Item> questItemsOwned = new ArrayList<Quest_Item>();
	
	/** Items required to graduate*/
	ArrayList<Holdable> gradRequirement = new ArrayList<Holdable>();
	
	/**
	 * constructor
	 */
	public Main_Character()
	{
		
	}	
	
	
	/* Accessors */
	
	/**
	 * @return currentLocation location currently occupied
	 */
	public Location getCurrentLocation()
	{
		return currentLocation;
	}
	/**
	 * @return keyItemsOwned ArrayList of items currently owned by character
	 */
	public ArrayList<Key_Item> getKey_ItemsOwned()
	{
		return keyItemsOwned;
	}
	

	/**
	 * 
	 * @return knowledgeOwned ArrayList of knowledge currently owned
	 */
	public ArrayList<Knowledge> getKnowledgeOwned()
	{
		return knowledgeOwned;
	}
	
	/**
	 * 
	 * @return questItemsOwned ArrayList of quest items currently owned
	 */
	public ArrayList<Quest_Item> getquestItemsOwned()
	{
		return questItemsOwned;
	}
	
	
	
	
	
	
	/**
	 * Once Character recieves messsage prints message to screen 
	 * @param s message to print
	 * 
	 * */
	public void recieveMessage(String s)
	{
		System.out.println(s);
		
	}
	
	/**
	 * Once Character recieves messsage prints message to screen
	 * @return input from player
	 *  */
	public String gatherMessage()
	{
		String s = scanner.nextLine();
		return s;
		
	}
	

	
	/**
	 * Adds holdable to the correct inventory array
	 * 
	 * @param holdable holdable entity to be recieved
	 */
	public void recieveHoldable(Holdable holdable)
	{
		// If holdable is knowldege puts knowledge in characters knowledgeOned arraylist
		if(holdable instanceof Knowledge)
		{
			knowledgeOwned.add((Knowledge)holdable);
			System.out.println("you recieved" +((Knowledge) holdable).getKnowledge());
		}
		
		// If holdable is key_Item puts knowledge in characters knowledgeOned arraylist	
		if(holdable instanceof Key_Item)
		{
			keyItemsOwned.add((Key_Item)holdable);
			System.out.println("you recieved" +((Key_Item) holdable).getName());
		}
		
		if(holdable instanceof Quest_Item)
		{
			questItemsOwned.add((Quest_Item)holdable);
			System.out.println("you recieved" +((Quest_Item) holdable).getName());
		}
		           					
	}	
	
	
	/** Displays items and knowledge currently owned*/
	public void displayInventory()
	{
		recieveMessage(Descriptions.INVENTORY + "\n" +
				Descriptions.KNOWLEDGEOWNED + knowledgeOwned + "\n" +
				Descriptions.KEYITEMSOWNED + keyItemsOwned + "\n" +
				Descriptions.QUESTITEMSOWNED + questItemsOwned );
	}
	
	
	/** causes Location to accept instructions */
	public void checkWhereYouAre()
	{
		if(firstTimeEntering)
		{
			firstTimeEntering = false;
			currentLocation.beEnteredForTheFirstTime(this);
		}
		else
		{
			currentLocation.recieveInstruction(this);
		}
	}
	
	
	/**
	 * checks if player has item
	 * 
	 * @param itemName item being searched for
	 * @return boolean if Main_Character has said item
	 */
	public boolean hasKeyItem(String itemName)
	{
		for(Key_Item temp: keyItemsOwned)
		{
			if(temp.getName().equals(itemName))
			{
				return true;
			}
		}
			return false;
	}

	
	/**
	 * checks if player has item
	 * 
	 * @param itemName item being searched for
	 * @return boolean if Main_Character has said item
	 */
	public boolean hasQuestItem(String itemName)
	{
		for(Quest_Item temp: questItemsOwned)
		{
			if(temp.getName().equals(itemName))
			{
				return true;
			}
		}
			return false;
	}
	
	
	/**
	 * checks if player has knowledge
	 * 
	 * @param knowledge knowledge being searched for
	 * @return boolean if Main_Character has said item
	 */
	public boolean hasKnowledge(String knowledge)
	{
		for(Knowledge temp: knowledgeOwned)
		{
			if(temp.getKnowledge().equals(knowledge))
			{
				return true;
			}
		}
			return false;
	}

	/**
	 * checks if player has holdable
	 * 
	 * @param h holdable being searched for
	 * @return boolean if Main_Character has said item
	 */
	public boolean hasHoldable(Holdable h)
	{
		if (h instanceof Knowledge)
		{
			return hasKnowledge(((Knowledge) h).getKnowledge());
		}
		if (h instanceof Key_Item)
		{
			return hasKeyItem(((Key_Item) h).getName());
		}
		if (h instanceof Quest_Item)
		{
			return hasQuestItem(((Quest_Item) h).getName());
		}
		
		// returns false if h is not of any 3 types
		return false;
	}
	
	/**
	 * causes character to enter location
	 * @param l location to be entered
	 */
	public void enterLocation(Location l)
	{
		currentLocation = l;
		firstTimeEntering = true;
	}
	
	/**
	 * 
	 * @param h graduation requirements
	 */
	public void setGraduationRequirement(ArrayList<Holdable> h)
	{
		gradRequirement = h;
	}
	
	
	/**
	 *  if player has gathered correct holdables then this causes them to win
	 */
	public void graduate()
	{
		boolean hasItAll = true;
		for (Holdable temp: gradRequirement)
		{
			if (!hasHoldable(temp))
			{
				hasItAll = false;
			}
		}
		
		if(hasItAll)
		{
			recieveMessage(Descriptions.GRADUATEACCEPTED);
		}
		else
		{
			recieveMessage(Descriptions.GRADUATEDENIED);
		}
			
				
	}
	
	
}

