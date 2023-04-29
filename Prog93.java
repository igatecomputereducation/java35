class Igate
{
	static
	{
		System.out.println("In static block");
	}

	{
		System.out.println("In initializing block");
	}

	Igate()
	{
		System.out.println("In constructor");
	}
}
class Prog93 
{
	public static void main(String[] args) 
	{
		new Igate();
		new Igate();
		new Igate();
	}
}
