
/**
 * 
 * @author Max Highsmith
 * @version 12/2/2014
 *
 *items which can be picked up by Person
 */
public abstract class Portable_Item extends Item implements Holdable 
{
	
	/** 
	 * @param aname name of item
	 */
	
	public Portable_Item(String aname, String adescription)
	{
		super(aname, adescription);
	}
	
	/**causes an item to be examined by character
	 * 
	 * @param character main character
	 * @param location location item is located in
	 * @param i index of item in location's item array
	 */
	public void beExamined(Main_Character character, Location location, int i)
	{
		character.recieveMessage(name+':'+description);
		character.recieveMessage(Descriptions.PICKUPQUESTION1+name+Descriptions.PICKUPQUESTION2);
		String s = character.gatherMessage();
		if(s.equals("yes"))
			{
				character.recieveHoldable(this);
				location.removeItem(i);
			}
		
		
	}

}
