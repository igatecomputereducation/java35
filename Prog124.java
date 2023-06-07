class First
{
	int x=10;	//overrided
}
class Second extends First
{
	int x=45;	//overriding
	void display()
	{
		System.out.println("super x:"+super.x);
		System.out.println("x:"+x);
	}
}
class Prog124 
{
	public static void main(String[] args) 
	{
		Second ob=new Second();
		ob.display();
	}
}
