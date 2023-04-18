class Demo
{
	void display(double...x)
	{
		System.out.println("double args");
	}
	void display(int...x)
	{
		System.out.println("int args");
	}
}
class Prog70
{
	public static void main(String[] args) 
	{
		Demo ob=new Demo();
		ob.display();
	}
}