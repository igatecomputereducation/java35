class Hello
{
	{
		System.out.println("Initializing block");
	}
	Hello()
	{
		System.out.println("constructor");
	}
}
class Prog82 
{
	public static void main(String[] args) 
	{
		new Hello();
		new Hello();
	}
}
