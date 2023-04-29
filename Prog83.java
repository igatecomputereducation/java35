class Num
{
	private int x;
	Num(int b)
	{
		x=b;
	}
	void printNum()
	{
		System.out.println("x:"+x);
	}
}
class Prog83 
{
	public static void main(String[] args) 
	{
		Num ob1=new Num(12);
		Num ob2=new Num(25);
		ob1.printNum();
		ob2.printNum();
	}
}
