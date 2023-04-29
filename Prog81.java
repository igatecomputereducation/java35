class Fibonacci
{
	int a,b,c;
	Fibonacci()
	{
		a=0;
		b=1;
		c=0;
	}
	void printTerm()
	{
		System.out.print(c+"\t");
		a=b;
		b=c;
		c=a+b;
	}
}
class Prog81 
{
	public static void main(String[] args) 
	{
		Fibonacci ob=new Fibonacci();
		for(int i=1;i<=10;i++)
			ob.printTerm();
	}
}
