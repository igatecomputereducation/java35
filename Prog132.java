abstract class Num
{
	protected int x,y;
	void setNum(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	abstract void manip();
}
class MyNum extends Num
{
	void manip()
	{
		System.out.println("Sum:"+(x+y));
	}
}
class Prog132 
{
	public static void main(String[] args) 
	{
		MyNum ob=new MyNum();
		ob.setNum(4,5);
		ob.manip();
	}
}
