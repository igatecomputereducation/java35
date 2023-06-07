class First
{
	void display()
	{
		System.out.println("in first display");
	}
}
class Second extends First
{
	@Override
	void display()
	{
		System.out.println("in second display");
	}
}
class Prog127 
{
	public static void main(String[] args) 
	{
		Second ob=new Second();
		ob.display();
	}
}