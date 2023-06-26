class Wish
{
	void hello()
	{
		System.out.println("Hello world");
	}
	void igate()
	{
		System.out.println("hello igate");
	}
}
class Prog178 
{
	public static void main(String[] args) 
	{
		Object ob=new Wish();
		((Wish)ob).hello();
		((Wish)ob).igate();
	}
}
