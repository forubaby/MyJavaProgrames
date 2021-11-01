package javapgms;

public abstract class second 
{

	public static void main(String[] args) 
	{
		EnfieldModels e=new EnfieldModels();
		e.noOfWheels();
		e.price();
		e.models();
	}
	
}

abstract class Ryef extends abst
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
class EnfieldModels extends Ryef
{
	public void models() 
	{
		System.out.println("RE250cc");
		System.out.println("Interceptor500");
		System.out.println("cassic 400");
		System.out.println("Enfield himalayan");
	}
	
}



