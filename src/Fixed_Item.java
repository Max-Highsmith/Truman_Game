/**
 * Items which cannot be picked up
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public class Fixed_Item extends Item
{

	/**
	 * 
	 * @param aname name of item
	 * @param adescription description of item
	 */
	public Fixed_Item(String aname, String adescription)
	{
		super(aname, adescription);
	}
	
	/**
	 * gives character information about item
	 */
	public void beExamined(Main_Character character, Location location, int i)
	{
		character.recieveMessage(name+':'+description);
	}
}