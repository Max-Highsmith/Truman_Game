
import java.util.Scanner;
public class Jacob
{
//  Class newObjectsName = new Class(parameters);	
	
	public static void main (String [] args)
	{
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter your mom?  (yes/no)");
		
		String x = reader.nextLine();
		
		//if(somestatement that is true or false)
		
		if(x.equals("yes"))
		{
			System.out.println("eat my shorts");
		}
		else
		{
			System.out.println("try again");
		}

		
		System.out.println(x);
		
		
	}

}
