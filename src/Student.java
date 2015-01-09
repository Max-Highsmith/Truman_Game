import java.util.ArrayList;


/**
 * Benevolent Monsters who give the main character holdable objects
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 *
 */
public class Student extends Monster
{
	/**Holdable objects which student give main character upon interaction */
	private ArrayList<Holdable> gift;
	
	/**
	 * 
	 * @param aname name of student
	 * @param adialog dialog of student
	 * @param agift gift student will give
	 */
	public Student(String aname, String adialog, ArrayList<Holdable> agift)
	{
		name = aname;
		dialog = adialog;
		gift = agift;
	}
	
	/**causeses student to give main character prize
	 * 
	 * @param main_character the main character
	 */
	public void interact(Main_Character main_character)
	{
		main_character.recieveMessage(name+':'+dialog);
		for(Holdable temp: gift)  // if so, give main_character the prizes
		{
			main_character.recieveHoldable(temp);
			
		}
	}
}
