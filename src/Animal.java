/**
 * Monster who speaks but does nothing helpful
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public class Animal extends Monster 
{
	String noise;
	
	/**
	 * 
	 * @param aname name of animal
	 * @param anoise noise animal makes
	 */
	public Animal(String aname, String anoise)
	{
		name = aname;
		noise = anoise;
	}
	
	/**
	 * animal says its noise
	 */
	public void interact(Main_Character c)
	{
		c.recieveMessage(name+": "+ noise);
	}

}
