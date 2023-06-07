class Hello
{
	final void wish()
	{
		System.out.println("hello world");
	}
}
class Igate extends Hello
{
	/*
	void wish()
	{
		System.out.println("igate solutions");
	}
	*/
}
class Prog137
{
	public static void main(String[] args) 
	{
		new Hello().wish();
		new Igate().wish();
	}
}