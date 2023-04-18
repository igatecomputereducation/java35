class Demo
{
	void display(int...x)
	{
		for(int t:x)
			System.out.print(t+"\t");
		System.out.println();
	}
	/*
	void display(int[] x)
	{
		for(int t:x)
			System.out.print(t+"\t");
		System.out.println();
	}*/
}
class Prog71
{
	public static void main(String[] args) 
	{
		Demo ob=new Demo();
		ob.display(12,45,67,78);
		ob.display(new int[]{10,20,30,40});
	}
}