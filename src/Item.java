
/**
 * inanimate entites in game
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public abstract class Item {
	/** Name of item */
	protected String name;
	
	/** description of item */
	protected String description;
	
	/**
	 * 
	 * @param aname name of item
	 * @param adescription  description of item
	 */
	public Item(String aname, String adescription)
	{
		name = aname;
		description = adescription;
	}
	
	/**
	 * 
	 * @return description: text description of item
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * 
	 * @return name: name of item
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return name: name of item
	 */
	public String toString()
	{
		return name;
	}
	
/**
 * 
 * @param character main character
 * @param location location character is in
 * @param i index of item in the array of items with the location where item is stored
 */
	public abstract void beExamined(Main_Character character, Location location, int i);
	
}
