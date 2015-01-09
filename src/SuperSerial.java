import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SuperSerial
{
	public static void main (String [] args)
	{
		String s = "write string";
		int x = 3;
		try{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stored.dat"));
		out.writeObject(s);
		out.writeObject(x);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("stored.dat"));
		
		String readingData = (String) in.readObject();
		int xx = (int) in.readObject();
		System.out.println(readingData);
		System.out.println(xx);
		in.close();
		
		
		}
		catch(Exception e)
		{
			System.out.println("nope");
		}
		


	}	
}
