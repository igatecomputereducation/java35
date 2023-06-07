class Outer
{
	private int x;
	Outer(int x)
	{
		this.x=x;
	}
	class Inner
	{
		private int y;
		Inner(int y)
		{
			this.y=y;
		}
		void display()
		{
			System.out.println("x:"+x);
			System.out.println("y:"+y);
		}
	}
}
class Prog111 
{
	public static void main(String[] args) 
	{
		Outer o=new Outer(12);
		Outer.Inner i=o.new Inner(15);
		i.display();
	}
}
