class Num
{
	private int x;
	void copy(Num r)
	{
		x=r.x;
	}
	void setNum(int x)
	{
		this.x=x;
	}
	void printNum()
	{
		System.out.println("x of Num:"+x);
	}
}
class Prog88 
{
	public static void main(String[] args) 
	{
		Num ob1=new Num();
		ob1.setNum(25);
		Num ob2=new Num();
		ob2.copy(ob1);
		ob1.printNum();
		ob2.printNum();
	}
}
