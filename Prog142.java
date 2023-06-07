interface Const
{
	double PI=3.14;
}
interface Shape
{
	void setData(int x);
	void printRes();
}
class Circle 
{
	int rad;
}
class MyCircle extends Circle implements Const,Shape
{
	public void setData(int x)
	{
		rad=x;
	}
	public void printRes()
	{
		System.out.println("Area:"+PI*rad*rad);
	}
}
class Prog142 
{
	public static void main(String[] args) 
	{
		Shape c=new MyCircle();
		c.setData(3);
		c.printRes();
	}
}
