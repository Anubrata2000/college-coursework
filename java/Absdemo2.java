class Absdemo2
{
	public static void main(String args[])
	{
		vehicle r;
		Car c = new Car();
		Truck t = new Truck();
		r = c; r.engine();
		r = t; r.engine();
	}
}

abstract class vehicle
{
	abstract void engine();
}

class Car extends vehicle
{
	void engine()
	{
		System.out.println("Car has good engine");
	}
}

class Truck extends vehicle
{
	void engine()
	{
		System.out.println("Truck has bad engine");
	}
}