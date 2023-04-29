class Hello
{
	static void sayHello()
	{
		System.out.println("Hello world");
	}
	static void manip(int x,int y)
	{
		System.out.println("Sum:"+(x+y));
	}
}
class Prog94 
{
	public static void main(String[] args) 
	{
		Hello.sayHello();
		Hello.manip(12,10);
		new Hello().sayHello();
		new Hello().manip(20,20);
	}
}
