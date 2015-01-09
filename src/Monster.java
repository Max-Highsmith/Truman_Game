
/**
 * The entities whom the main character may speak to
 * 
 * @author Max Highsmith
 * @version 12/4/2014
 *
 */
public abstract class Monster 
{
	/**What monster says upon interaction */
	protected String dialog;
	/** Name of monster */
	protected String name;
	
	/**
	 * 
	 * @return dialog: what monster says upon interaction
	 */
	public String getDialog()
	{
		return dialog;
	}
	
	/**
	 * 
	 * @return name: monsters name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return name: monsters name
	 */
	public String toString()
	{
		return name;
	}
	
	/**Behavior of Monster once interacted with */
	public abstract void interact(Main_Character c);
	
}
