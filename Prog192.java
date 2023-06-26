class First<F>
{
	F x;
	void setX(F x)
	{
		this.x=x;
	}
	void printX()
	{
		System.out.println("x:"+x);
	}
}
class Second<E> extends First<E>
{
	E y;
	void setData(E x,E y)
	{
		setX(x);
		this.y=y;
	}
	void printData()
	{
		printX();
		System.out.println("y:"+y);
	}
}
class Prog192 
{
	public static void main(String[] args) 
	{
		Second<String> ob=new Second<String>();
		ob.setData("hello","world");
		ob.printData();
	}
}
