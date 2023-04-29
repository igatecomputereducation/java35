class Hello
{
	Hello()
	{
		System.out.println("hello world");
	}
	Hello(String str)
	{
		this();
		System.out.println("hello "+str);
	}
}
class Prog87 
{
	public static void main(String[] args) 
	{
		//new Hello();
		new Hello("igate");
	}
}
