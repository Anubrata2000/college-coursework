interface sum
{
	
	void display();
}

interface add
{
	
	void result();
}

class A1 implements sum,add
{
	public void display()
		{
			System.out.println("Sum: ");
		}
	
	public void result()
		{
			System.out.println("Add: ");
		}
}

class Inter1
{
	public static void main (String args[])
	{
		A1 a = new A1();
		a.display();
		a.result();
	}
}