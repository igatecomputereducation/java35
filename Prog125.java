class First
{
	void display()//overrided
	{
		System.out.println("in first display");
	}
}
class Second extends First
{
	void display()//overriding
	{
		super.display();
		System.out.println("in second display");
	}
}
class Prog125 
{
	public static void main(String[] args) 
	{
		new Second().display();
	}
}