package javapgms;

public class java implements Book
{
	public void bookname()
	{
		System.out.println("core java");
	}
	public void author()
	{
		System.out.println("hydari");
	}
	public void dateofbarrow()
	{
		System.out.println("05-05-97");
	}

}
class Sql implements Book 
{
	public void bookname()
	{
		System.out.println("SQL queries");
	}
	public void author()
	{
		System.out.println("das");
	}
	public void dateofbarrow()
	{
		System.out.println("15-10-99");
	}

}
class Apti implements Book
{
	public void bookname()
	{
		System.out.println("simple apti");
	}
	public void author()
	{
		System.out.println("nayak");
	}
	public void dateofbarrow()
	{
		System.out.println("12-03-2018");
	}

}
class Librarian
{
	public static void main(String[] args)
	{
		java j=new java();
		j.bookname();
		j.author();
		j.dateofbarrow();
		Sql s=new Sql();
		s.bookname();
		s.author();
		s.dateofbarrow();
		Apti a=new Apti();
		a.bookname();
		a.author();
		a.dateofbarrow();
	}
}