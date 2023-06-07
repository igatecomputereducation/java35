interface Hello
{
	void wish();
	void world();
}
class MyHello implements Hello
{
	public void wish()
	{
		System.out.println("hello world");
	}
	public void world()
	{
		System.out.println("Hot world");
	}
}
class Prog140 
{
	public static void main(String[] args) 
	{
		Hello ob=new MyHello();
		ob.wish();
		ob.world();
	}
}
