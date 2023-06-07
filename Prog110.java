class First
{
	First()
	{
		System.out.println("In first constructor");
	}
	void dispFirst()
	{
		System.out.println("In first method");
	}
	class Second
	{
		Second()
		{
			System.out.println("In second constructor");
		}
		void dispSecond()
		{
			System.out.println("In second method");
		}
	}
}
class Prog110 
{
	public static void main(String[] args) 
	{
		First f=new First();
		First.Second s=f.new Second();
		f.dispFirst();
		s.dispSecond();
	}
}
