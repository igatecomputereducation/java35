class Num
{
	private int x;
	Num()
	{
		x=56;
	}
	void printNum()
	{
		System.out.println("x:"+x);
	}
}
class Prog80
{
	public static void main(String[] args) 
	{
		Num ob1=new Num();
		Num ob2=new Num();
		ob1.printNum();
		ob2.printNum();
	}
}
