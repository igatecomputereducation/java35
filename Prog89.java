class Num
{
	private int x;
	Num()
	{
	}
	Num(Num r)
	{
		x=r.x;
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
class Prog89 
{
	public static void main(String[] args) 
	{
		Num ob1=new Num();
		ob1.setNum(25);
		
		Num ob2=new Num(ob1);
		
		ob1.printNum();
		ob2.printNum();
	}
}
