class Num
{
	private int x;
	void setNum(int x)
	{
		this.x=x;
	}
	void printNum()
	{
		System.out.println("x:"+x);
	}
}
class Prog76 
{
	public static void main(String[] args) 
	{
		Num ob=new Num();
		ob.setNum(12);
		ob.printNum();
	}
}
