class Display
{
	void first()
	{
		System.out.println("In first");
		second();
	}
	void second()
	{
		System.out.println("In second");
	}
}
class Prog54 
{
	public static void main(String[] args) 
	{
		Display ob=new Display();
		ob.first();
	}
}
