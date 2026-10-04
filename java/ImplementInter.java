class ImplementInter
{
	public static void main (String args[])
	{
		calculation b = new calculation();
		b.sum(10,20);
		b.multiply(10,20);
		b.division(20,10);
		b.substraction(20,10);
	}
}


interface A
{
	void sum(int a , int b);
}

interface B
{
	void multiply(int a , int b);
}

interface C
{
	void substraction(int a , int b);
}

interface D
{
	void division(int a , int b);
}


class calculation implements A,B,C,D
{
	public void sum (int a , int b) 
	{
		int c = a + b;
		System.out.println("Summation: "+c);
	}
	
	public void multiply(int a , int b)
	{
		int c = a * b;
		System.out.println("Multiplication: "+c);
	}

	public void substraction(int a , int b)
	{
		int c = a - b;
		System.out.println("Substraction: "+c);
	}

	public void division(int a , int b)
	{
		if (b > 0)
		{
			int c = a / b;
			System.out.println("Division: "+c);
		}
		else
		{
			System.out.println("Enter non-zero denominator");
		}
	}
}
