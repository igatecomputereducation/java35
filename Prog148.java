interface Hello
{
	default void sayHello()
	{
		System.out.println("Hello world");
	}
}
/*
class MyHello implements Hello
{
}
*/
class Prog148 
{
	public static void main(String[] args) 
	{
		//new MyHello().sayHello();

		Hello ob=new Hello(){
		
		};
		ob.sayHello();
	}
}