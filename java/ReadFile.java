import java.io.File;
import java.io.*;
import java.util.*;
class ReadFile
{
	public static void main(String args[]){
	try{
	    File ob = new File("ReadFile.java");
	    Scanner sc=new Scanner(ob);

	    while(sc.hasNextLine())
	    {
	    	String data=sc.nextLine();
	    	System.out.println(data);
	    }
	    sc.close();
	}

	    
	    catch (FileNotFoundException e)
	    {
	    	System.out.println("problem! File not found.");
            e.printStackTrace();
	    }
	}
}