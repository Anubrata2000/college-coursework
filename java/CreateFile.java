import java.io.File;
import java.io.IOException;
class CreateFile
{
	public static void main(String args[]){
	try{
	    File ob = new File("E:\\anubrata.txt");
	    if (ob.createNewFile())
	    {
	    	System.out.println("File created:" + ob.getName());
	    }
	    else
	    {
	    	System.out.println("File already exists.");
	    }
	    }
	    catch (IOException e)
	    {
	    	System.out.println("An error occured.");
            e.printStackTrace();
	    }
	}
}