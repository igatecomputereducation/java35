class First
{
	void dispFirst()
	{
		System.out.println("in first");
	}
}
class Second extends First
{
	void dispSecond()
	{
		System.out.println("in second");
	}
}
class Prog116
{
	public static void main(String[] args) 
	{
		First ob1=new First();
		ob1.dispFirst();

		Second ob2=new Second();
		ob2.dispFirst();
		ob2.dispSecond();
	}
}