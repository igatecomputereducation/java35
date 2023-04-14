class Num
{
	void manip(int x,int y)
	{
		System.out.println("Sum:"+(x+y));
		System.out.println("Subtraction:"+(x-y));
	}
}
class Prog45 
{
	public static void main(String[] args) 
	{
		Num ob=new Num();
		ob.manip(4,5);
	}
}
