class Hello
{
	void sayHello()
	{
		System.out.println("Hello world");
	}
	void sayIgate()
	{
		System.out.println("igate solutions");
	}
	void delegate()
	{
		Printer p=new Printer();
		p.display(this);
	}
}
class Printer
{
	void display(Hello h)
	{
		h.sayHello();
		h.sayIgate();
	}
}
class Prog78 
{
	public static void main(String[] args) 
	{
		new Hello().delegate();
	}
}
