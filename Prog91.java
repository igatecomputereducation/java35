class Emp
{
	static String cname;
	static int deptno;
	private String name;
	private int sal;
	Emp(String name,int sal)
	{
		this.name=name;
		this.sal=sal;
	}
	void printData()
	{
		System.out.println("\t\t"+cname);
		System.out.println("\t\tDeptno:"+deptno);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+sal);
		System.out.println("=".repeat(30)); 
	}
}
class Prog91 
{
	public static void main(String[] args) 
	{
		Emp.cname="Cloud99 Labs";
		Emp.deptno=30;
		Emp ob1=new Emp("Lokesh",25000);
		Emp ob2=new Emp("Naresh",32000);
		ob1.printData();
		ob2.printData();
	}
}