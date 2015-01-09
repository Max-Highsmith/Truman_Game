
import java.util.ArrayList;

/**
 * 
 * @author Max Highsmith
 * @version 12/2/2014
 *
 *Teacher is a Monster who asks player questions and return prizes if answered correctly
 */

public class Teacher extends Monster
{
	/** Question teacher will ask*/
	Question question;
	
	/** Prize given if question is anwered correctly */
	ArrayList<Holdable> prize;
	
	
	/**
	 * @param aname teacher name
	 * @param adialog starting dialog with teacher
	 * @param aquestion  question for teacher to ask
	 * @param aprize  prize for teacher to give
	 */
	public Teacher(String aname, String adialog, Question aquestion, ArrayList<Holdable> aprize)
	{
		name = aname;
		dialog = adialog;
		question = aquestion;
		prize = aprize;
	}
	
	/**
	 * causes teacher to ask main_character question
	 * if they answer correctly main_character recieves a prize
	 */
	public void interact(Main_Character main_character)
	{
		main_character.recieveMessage(name+':'+dialog);
		if(question.ask(main_character)) // check if question is anwered correctly
		{
			main_character.recieveMessage(name+':'+ question.getRight());
			for(Holdable temp: prize)  // if so, give main_character the prizes
			{
				main_character.recieveHoldable(temp);
				
			}
			
			while(!prize.isEmpty())
			{
				prize.remove(0);
			}
			
		}
		else
		{
			main_character.recieveMessage(name+':'+ question.getWrong());
		}
	}
	
		
}
