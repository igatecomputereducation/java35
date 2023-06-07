class Outer
{
	//int x=10;
	static int y=20;
	static class Inner
	{
		void display()
		{
			//System.out.println(x);
			System.out.println(y);
			System.out.println("display of inner");
		}
		static void show()
		{
			System.out.println("show of inner");
		}
	}
}
class Prog113 
{
	public static void main(String[] args) 
	{
		Outer.Inner ob=new Outer.Inner();
		ob.display();
		Outer.Inner.show();
	}
}