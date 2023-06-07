class First
{
	private int x;
	First(int x)
	{
		this.x=x;
	}
	void printX()
	{
		System.out.println("x:"+x);
	}
}
class Second extends First
{
	private int y;
	Second(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void printNum()
	{
		printX();
		System.out.println("y:"+y);
	}
}
class Prog122
{
	public static void main(String[] args) 
	{
		Second s=new Second(4,5);
		s.printNum();
	}
}