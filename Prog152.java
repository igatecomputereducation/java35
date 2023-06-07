class TVSKeyBoard
{
	void printDetails()
	{
		System.out.println("Made in india");
		System.out.println("5 Years");
		System.out.println("Feel of love to type");
	}
}
class WiproKeyBoard
{
	void printDetails()
	{
		System.out.println("Made in india");
		System.out.println("7 Years");
		System.out.println("feel to work more");
	}
}
class Computer
{
	void useKeyBoard(TVSKeyBoard kb)
	{
		kb.printDetails();
	}
	void useKeyBoard(WiproKeyBoard kb)
	{
		kb.printDetails();
	}
}
class Prog152 
{
	public static void main(String[] args) 
	{
		//TVSKeyBoard k=new TVSKeyBoard();
		WiproKeyBoard k=new WiproKeyBoard();
		Computer c=new Computer();
		c.useKeyBoard(k);
	}
}
