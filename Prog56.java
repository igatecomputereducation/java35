class Display
{
	int x=45;
	void first()
	{
		System.out.println(x);
		x=x+5;
	}
	void second()
	{
		System.out.println(x);
		x=x+5;
	}
}
class Prog56
{
	public static void main(String[] args) 
	{
		Display ob=new Display();
		ob.first();
		ob.second();
		System.out.println(ob.x);
	}
}
