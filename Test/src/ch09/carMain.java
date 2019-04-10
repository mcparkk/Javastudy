package ch09;

public class carMain 
{
	static void drive(car car) 
	{
		car.move();
	}
	public static void main(String[] args) 
	{
		sportsCar sc = new sportsCar();
		drive(sc);
		sportsCar2 sc2 = new sportsCar2();
		drive(sc2);
		
	}
}
