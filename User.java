package javapgms;

public class User 
{

	public static void main(String[] args) 
	{
		Custu s1=new Custu();
		s1.deposit();
		s1.withdraw();
		// TODO Auto-generated method stub
	}

}
class Custu implements ATM
{

	@Override
	public void deposit() 
	{
		System.out.println("pls deposit amount");
		// TODO Auto-generated method stub
	}

	@Override
	public void withdraw() 
	{
		System.out.println("pls collect amount");
		// TODO Auto-generated method stub
		
	}
	
}
