abstract class First
{
	abstract void display();
	abstract void show();
}
abstract class Second extends First
{
	void display()
	{
		System.out.println("Display");
	}
}
class Third extends Second
{
	void show()
	{
		System.out.println("show");
	}
}
class Prog131 
{
	public static void main(String[] args) 
	{
		First ob=new Third();
		ob.display();
		ob.show();
	}
}