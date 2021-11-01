package javapgms;

public class first 
{
	public static void main(String[] args)
	{
		RoyalEnfield r=new RoyalEnfield();
		r.noOfWheels();
		r.price();
		
	}

}
class RoyalEnfield extends abst1
{

	@Override
	public void price() 
	{
		System.out.println("1.5lakhs");
	}

	@Override
	public void noOfWheels() 
	{
		System.out.println("2 wheels");
	}
		
}
