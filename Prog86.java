class Num
{
	private int x;
	Num()
	{
	}
	Num(int x)
	{
		this.x=x;
	}
	void setNum(int x)
	{
		this.x=x;
	}
	void printNum()
	{
		System.out.println("x:"+x);
	}
}
class Prog86
{
	public static void main(String args[])
	{
		Num ob1=new Num();
		ob1.setNum(12);

		Num ob2=new Num(25);

		ob1.printNum();
		ob2.printNum();
	}
}