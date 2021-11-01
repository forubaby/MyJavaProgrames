package javapgms;

public abstract class Audi implements Car
{
	public void carname()
	{
		System.out.println("range rover");
	}
	public void carcolor()
	{
		System.out.println("red");
	}
}
class Audimodels extends Audi
{
	public void carprice()
	{
		System.out.println("Range rover sport"+" "+"9000000");
		System.out.println("Range rover velar"+" "+"5000000");
		System.out.println("Discovery sport"+" "+"10000000");
		
	}
}
class Showroom
{
	public static void main(String[] args)
	{
		Audimodels a=new Audimodels();
		a.carname();
		a.carcolor();
		a.carprice();
		
	}
}