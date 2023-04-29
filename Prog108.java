class Display
{
	private Display()
	{
		System.out.println("In constructor");
	}
	void first()
	{
		System.out.println("In first method");
	}
	void second()
	{
		System.out.println("In second method");
	}
	static Display getObject()
	{
		return new Display();
	}
}
class Prog108 
{
	public static void main(String[] args) 
	{
		//Display d=new Display();
		Display c=Display.getObject();
		c.first();
		c.second();
	}
}
