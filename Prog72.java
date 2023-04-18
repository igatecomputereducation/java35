class Hello
{
	void first()
	{
		System.out.println("In first method");
	}
	void second()
	{
		System.out.println("In second method");
	}
}
class Prog72 
{
	public static void main(String[] args) 
	{
		/*
		Hello ob=new Hello();
		ob.first();
		ob.second();
		*/

		new Hello().first();
		new Hello().second();
	}
}