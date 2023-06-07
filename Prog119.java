class First
{
	private int x;
	void setX(int p)
	{
		x=p;
	}
	void printX()
	{
		System.out.println("x:"+x);
	}
}
class Second extends First
{
	int y;
	void setNum(int p,int q)
	{
		setX(p);
		y=q;
	}
	void printData()
	{
		printX();
		System.out.println("y:"+y);
	}
}
class Prog119
{
	public static void main(String[] args) 
	{
		Second ob=new Second();
		ob.setNum(12,34);
		ob.printData();
	}
}
