
/** 
 * @author Max Highsmith
 * @version 12/2/2014
 * 
 * Question to be asked to main player
 * 
 * */
public class Question 
{
	/** question to be asked*/
	private String question;
	
	/** correct answer */
	private String answer;	


	
	public Question(String q, String a)
	{
		question = q;
		answer = a;
	}
	
	/*Accessors */
	/**
	 * 
	 * @return wrong String to display if question is answered wrong
	 */
	public String getWrong()
	{
		return Descriptions.WRONG;
	}
	
	/**
	 * 
	 * @return right:  String to display if question is answered right
	 */
	public String getRight()
	{
		return Descriptions.RIGHT;	
	}
	
	
	/**
	 * asks question
	 * 
	 * @param c main character
	 * @return true if answered correctly
	 */
	public boolean ask(Main_Character c)
	{
		c.recieveMessage(question);
		if(c.gatherMessage().equals(answer))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
}
