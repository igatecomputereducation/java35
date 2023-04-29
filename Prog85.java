//Prog85.java
class Num
{
	private int x;
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
class Prog85
{
	public static void main(String args[])
	{
		Num ob=new Num();
		Num ob=new Num(12);
		ob.printNum();
		ob.setNum(25);
		ob.printNum();
	}
}