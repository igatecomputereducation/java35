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
class Second<K,L> extends First<K>
{
	L y;
	void setData(K x,L y)
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
class Prog193
{
	public static void main(String[] args) 
	{
		Second<String,Boolean> ob=new Second<String,Boolean>();
		ob.setData("hello",true);
		ob.printData();
	}
}