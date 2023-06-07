class First
{
	void hello()
	{
		System.out.println("hello world");
	}
}
class Second extends First
{
	void igate()
	{
		System.out.println("Igate solutions");
	}
}
class Prog128 
{
	public static void main(String[] args)
	{
		First ob1=new First();
		ob1.hello();
		//ob1.igate();

		System.out.println("-".repeat(20));

		Second ob2=new Second();
		ob2.hello();
		ob2.igate();

		System.out.println("-".repeat(20));

		First ob3=new Second();
		ob3.hello();
		//ob3.igate();

		System.out.println("-".repeat(20));
	}
}