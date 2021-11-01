package javapgms;

import java.util.Scanner;

public class primenumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
			}
		}
		if(prime==false)
		{
			System.out.println("the num is not prime");
		}
		else
		{
			System.out.println("the num is prime");
		}
	}

}
