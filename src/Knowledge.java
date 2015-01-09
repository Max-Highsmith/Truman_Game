
/**
 * Ideas which player can hold
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public class Knowledge implements Holdable
{
	/** String identifying what the knowledge is */
	private String whatUKnow;
	
	/** 
	 * 
	 * @param wuk identifying what the knowledge is
	 */
	public Knowledge(String wuk)
	{
		whatUKnow = wuk;
	}
	
	/** 
	 * 
	 * @return String identifying what the knowledge is
	 */
	public String getKnowledge()
	{
		return whatUKnow;
	}
	
	
	/** 
	 * 
	 * @return whatUKNow String identifying what the knowledge is
	 */
	public String toString()
	{
		return whatUKnow;
	}
}
