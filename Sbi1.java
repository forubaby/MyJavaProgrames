package javapgms;

public abstract class Sbi1 extends Rbi1
{
	public void minbal()
	{
		System.out.println("3000");
	
	}
	public void rateofint()
	{
		System.out.println("25%");
		
	}
	abstract public void aadharlink();
}
class Sbh1 extends Sbi1
{
	public void aadharlink()
	{
		System.out.println("aadhar linked");
		
	}
}
class Customer
{
	public static void main(String[] args)
	{
		Sbh1 s=new Sbh1();
		s.minbal();
		s.rateofint();
		s.aadharlink();
		
	}
}