class Person
{
	private String name,gen;
	void setPerDet(String name,String gen)
	{
		this.name=name;
		this.gen=gen;
	}
	void printPerDet()
	{
		System.out.println("Name:"+name+"\nGender:"+gen);
	}
}
class Emp extends Person
{
	private int sal;
	void setEmpDet(String name,String gen,int sal)
	{
		setPerDet(name,gen);
		this.sal=sal;
	}
	void printEmpDet()
	{
		printPerDet();
		System.out.println("Salary:"+sal);
	}
}
class Prog120 
{
	public static void main(String[] args) 
	{
		Emp ob=new Emp();
		ob.setEmpDet("Naresh","Male",12000);
		ob.printEmpDet();
	}
}
