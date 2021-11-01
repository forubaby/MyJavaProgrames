package javapgms;

public class Userlogic1 
{

	public static void main(String[] args) 
	{
		mathsbookdetails(new Maths());
		physicsbookdetails(new Physics());
	}
	public static void mathsbookdetails(Maths m)
	{
		m.price();
		m.author();

	}
	public static void physicsbookdetails(Physics p)
	{
		p.price();
		p.author();
	}

}
class Maths implements Book1
{
	public void price()
	{
		System.out.println(5900);
	}
	public void author()
	{
		System.out.println("charan");
		
	}
}
class Physics implements Book1
{
	public void price()
	{
		System.out.println(3400);
		
	}
	public void author()
	{
		System.out.println("sai");
		
	}
}
