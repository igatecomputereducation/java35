class Prog99 
{
	static void manip(int x,int y)
	{
		System.out.println("Sum:"+(x+y));
	}
	static void biggest(int x,int y)
	{
		if(x==y)
			System.out.println("Equals");
		else if(x>y)
			System.out.println("Biggest:"+x);
		else
			System.out.println("Biggest:"+y);
	}
	public static void main(String[] args) 
	{
		manip(34,12);
		biggest(34,12);
	}
}
