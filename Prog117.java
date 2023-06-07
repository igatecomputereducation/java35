class First
{
	int x;
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
	void setY(int q)
	{
		y=q;
	}
	void printY()
	{

		System.out.println("y:"+y);
	}
}
class Prog117 
{
	public static void main(String[] args) 
	{
		First ob1=new First();
		ob1.setX(45);

		Second ob2=new Second();
		ob2.setX(20);
		ob2.setY(50);

		ob1.printX();
		
		ob2.printX();
		ob2.printY();
	}
}
