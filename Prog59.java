class Employee
{
	private String ename;
	private int sal;
	private float hra,da,gross;
	void setData(String en,int sl)
	{
		ename=en;
		sal=sl;
	}
	void calculate()
	{
		hra=(float)sal*12/100;
		da=(float)sal*15/100;
		gross=sal+hra+da;
	}
	void printData()
	{
		System.out.println("Payslip\n================");
		System.out.println("Name:"+ename);
		System.out.println("Salary:"+sal);
		System.out.println("HRA:"+hra+"\nDA:"+da);
		System.out.println("Gross:"+gross);
	}
}
class Prog59 
{
	public static void main(String[] args) 
	{
		Employee ob=new Employee();
		ob.setData("Lucky",25000);
		ob.calculate();
		ob.printData();
	}
}
