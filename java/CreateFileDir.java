import java.io.File;
import java.io.IOException;
class CreateFileDir
{
	public static void main(String args[])
	{
		try
		{
			File obj = new File("D:\\anubrata1.txt");
			if (obj.createNewFile())
			{
                 System.out.println("File created:" + obj.getName());
                 System.out.println("Absolute path:" + obj.getAbsolutePath());
			}
			else 
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}