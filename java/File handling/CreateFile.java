import java.io.File;
import java.io.IOException;
public class CreateFile
{
    public static void main(String[] args)
    {
        try
        {
            File obj=new File("New.txt");
            if(obj.createNewFile())
            {
                System.out.println("File created: "+obj.getName());
                System.out.println("File path: "+obj.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();			//It returns all the details of an error message
        }
    }
}