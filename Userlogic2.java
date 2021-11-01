package javapgms;

public class Userlogic2 {

	public static void main(String[] args) 
	{
		animaldetails(new Dog());
		animaldetails(new Cat());
		animaldetails(new Monkey());

	}
	public static void animaldetails(Animal a)
	{
		a.eat();
		a.makesound();
	}
	
}
class Dog implements Animal
{
	public void eat()
	{
		System.out.println("dog eats biscuits");
	}
	public void makesound()
	{
		System.out.println("bow bow");
	}
}
class Cat implements Animal
{
	public void eat()
	{
		System.out.println("cat eats chicken");
		
	}
	public void makesound()
	{
		System.out.println("meow meow");
	}
}
class Monkey implements Animal
{
	public void eat()
	{
		System.out.println("monkey eats banana");
		
	}
	public void makesound()
	{
		System.out.println("wowowowo");
	}
}
