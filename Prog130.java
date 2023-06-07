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
		System.out.println("HRA:"+hra+"\nDA:"+
									da+"\nGross:"+gross);
	}
}
class MyEmp extends Emp
{
	void calculate()
	{
		hra=sal*12.0/100;
		da=sal*15.0/100;
		gross=sal+hra+da;
	}
}
class Prog130 
{
	public static void main(String[] args) 
	{
		//Emp ob=new Emp();
		Emp ob=new MyEmp();
		ob.setDetails("Prakash",12000);
		ob.calculate();
		ob.printDetails();
	}
}