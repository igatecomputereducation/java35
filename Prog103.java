class Num
{
	Num()
	{
		System.out.println("In constructor");
	}
	static{
		System.out.println("i am in static block");
	}
}
class Prog103 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("Num");
	}
}