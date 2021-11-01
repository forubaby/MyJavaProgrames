package javapgms;

public class Userlogic 
{

	public static void main(String[] args) 
	{
		
			audidetails(new Audi1());
			benzdetails(new Benz1());
		}
		public static void audidetails(Audi1 a)
		{
			a.price();
			a.color();
		}
		public static void benzdetails(Benz1 b)
		{
			b.price();
			b.color();
		}

}
class Audi1 implements Car1
{
	public void price()
	{
		System.out.println(100000);
	}
	public void color()
	{
		System.out.println("red");
	}
}
class Benz1 implements Car1
{
	public void price()
	{
		System.out.println(5000000);
	}
	public void color()
	{
		System.out.println("Black");
	}
}