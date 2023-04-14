class Num
{
	void sum(int x,int y)
	{
		System.out.printf("Addition:%d\n",x+y);
	}
	void sum(int x,int y,int z)
	{
		System.out.printf("Addition:%d\n",x+y+z);
	}
}
class Prog61 
{
	public static void main(String[] args) 
	{
		Num ob=new Num();
		ob.sum(10,20);
		ob.sum(4,5,6);
	}
}
