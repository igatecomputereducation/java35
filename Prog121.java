class First
{
	First()
	{
		System.out.println("In first constr");
	}
}
class Second extends First
{
	Second()
	{
		System.out.println("In second constr");
	}
}
class Prog121 
{
	public static void main(String[] args) 
	{
		new Second();
	}
}
