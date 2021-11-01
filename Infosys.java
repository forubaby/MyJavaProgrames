package javapgms;

abstract public class Infosys implements Employers
{
	public void salbankacc()
	{
		System.out.println("sbI");
	}
	public void trainingcenter()
	{
		System.out.println("goa");
		
	}
	public void departments()
	{
		System.out.println("working It comprises of all amjor depts of IT sector");
	}

}
class Bnglrdc extends Infosys
{
	public void projects()
	{
		System.out.println("nothing projects");
	}
}
class Custmr
{
	public static void main(String[] args)
	{
		Bnglrdc b=new Bnglrdc();
		b.salbankacc();
		b.trainingcenter();
		b.departments();
		b.projects();

	}
}