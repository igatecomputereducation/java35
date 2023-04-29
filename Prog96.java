class Num
{
	static int x;
	static{
		x=45;
	}
	static void hello()
	{
		System.out.println("Hello world");
	}
	void display()
	{
		hello();
		System.out.println(x);
	}
}
class Prog96 
{
	public static void main(String[] args) 
	{
		new Num().display();
	}
}
