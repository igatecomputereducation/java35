class First
{
	int x;
}
class Second extends First
{
	int y;
	void setNum(int p,int q)
	{
		x=p;
		y=q;
	}
	void printData()
	{
		System.out.println("x:"+x+"\ny:"+y);
	}
}
class Prog118
{
	public static void main(String[] args) 
	{
		Second ob=new Second();
		ob.setNum(12,34);
		ob.printData();
	}
}
