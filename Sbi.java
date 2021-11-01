package javapgms;


public class Sbi extends Rbi
{
	public void minbal()
	{
		System.out.println("5000");
	}
	public void rateofint()
	{
		System.out.println("20%");
	}
}

class Cust
{
	public static void main(String[] args)
	{
		Sbi s=new Sbi();
		s.minbal();
		s.rateofint();
	}
}