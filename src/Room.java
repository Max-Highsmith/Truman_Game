import java.util.ArrayList;

/**
 * Location that can have entry requirement
 * 
 * @author Max Highsmith
 * version 12/4/14
 *
 */
public class Room extends Location
{
	/**requirement to enter room */
	private Holdable entryRequirement;
	
	/**
	 * 
	 * @param aname name of Room
	 * @param adescription description of Room
	 * @param m monsters in room
	 * @param i items in room
	 * @param l locations in room
	 */
	public Room(String aname, String adescription, ArrayList<Monster> m, ArrayList<Item> i, ArrayList<Location> l)
	{
		super( aname,  adescription, m,  i,  l);
	
	}
	
	
	/**
	 * 
	 * @param h holdable item required to enter
	 */
	public void setEntryRequirement(Holdable h)
	{
		entryRequirement = h;
	}
	
	/**
	 * 
	 * @return entryRequirement object main character must have to enter room
	 */
	public Holdable getEntryRequirement()
	{
		return entryRequirement;
	}
	
	/**
	 * determines if character is qualified to enter room
	 * 
	 * @param main_character main character  
	 * @return true if main_character is qualified to enter
	 */
	public boolean determineIfEnterable(Main_Character main_character)
	{	
		//if there is a requirement to enter room
		if(this.entryRequirement != null)
		{
			if(main_character.hasHoldable(entryRequirement))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	
		
		

	
	
}
