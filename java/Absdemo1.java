class Absdemo1
{
	public static void main(String args[])
	{
		A r;
		B b = new B();
		r = b; 
		r.call();
	}
}

abstract class A
{
	abstract void call();
	void callme()
	{
		System.out.println("Call me from A");
	}
}

class B extends A
{
	void call()
	{
		System.out.println("Call me from B");
	}
}