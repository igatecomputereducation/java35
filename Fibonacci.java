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