class Employee
{
	String ename;
	int sal;
	double hra,da,gross;
}
class Prog42 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.ename="Naresh";
		e1.sal=12000;
		e1.hra=e1.sal*12.0/100;
		e1.da=e1.sal*15.0/100;
		e1.gross=e1.sal+e1.hra+e1.da;

		Employee e2=new Employee();
		e2.ename="Sirish";
		e2.sal=25000;
		e2.hra=e2.sal*12.0/100;
		e2.da=e2.sal*15.0/100;
		e2.gross=e2.sal+e2.hra+e2.da;

		System.out.println("Payslips..");
		System.out.println("Empno:"+e1.ename+"\nSalary:"+e1.sal+"\nHRA:"+e1.hra+"\nDA:"+e1.da+"\nGross:"+e1.gross);
		
		System.out.println("=============");
		
		System.out.println("Empno:"+e2.ename+"\nSalary:"+e2.sal+"\nHRA:"+e2.hra+"\nDA:"+e2.da+"\nGross:"+e2.gross);
	}
}