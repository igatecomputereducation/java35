interface KeyBoard
{
	void printDetails();
}
class TVSKeyBoard implements KeyBoard
{
	public void printDetails()
	{
		System.out.println("Made in india");
		System.out.println("5 Years");
		System.out.println("Feel of love to type");
	}
}
class MicrosoftKeyBoard implements KeyBoard
{
	public void printDetails()
	{
		System.out.println("looks and feel good");
	}
}
class Computer	//consumer
{
	void useKeyBoard(KeyBoard kb)
	{
		kb.printDetails();
	}
}
class Prog153
{
	public static void main(String[] args) 
	{
		TVSKeyBoard k1=new TVSKeyBoard();
		MicrosoftKeyBoard k2=new MicrosoftKeyBoard();
		Computer c=new Computer();
		c.useKeyBoard(k1);
		c.useKeyBoard(k2);
	}
}
