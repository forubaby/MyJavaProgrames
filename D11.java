package javapgms;

public class D11 
{
	protected static int i=100;
	public static void main(String[] args)
	{
	System.out.println(i);
	D22.fly();
	}
}
class D22
{
	public static void fly()
	{
		System.out.println(D11.i);
	}
}
