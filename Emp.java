abstract class Emp
{
	protected String name;
	protected int sal;
	protected double hra,da,gross;
	void setDetails(String name,int sal)
	{
		this.name=name;
		this.sal=sal;
	}
	abstract void calculate();
	void printDetails()
	{
		System.out.println("Name:"+name+"\nSalary:"+sal);
		System.out.println("HRA:"+hra+"\nDA:"+da+"\nGross:"+gross);
	}
}