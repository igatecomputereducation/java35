class First
{
	void hello()
	{
		System.out.println("hello world");
	}
	void display()
	{
		System.out.println("display of first");
	}
}
class Second extends First
{
	void igate()
	{
		System.out.println("Igate solutions");
	}
	void display()
	{
		System.out.println("display of second");
	}
}
class Prog129
{
	public static void main(String[] args)
	{
		First ob=new Second();
		ob.hello();
		ob.display();
		//ob.igate();
	}
}