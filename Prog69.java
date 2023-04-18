class Demo
{
	void display(int x,int y)
	{
		System.out.println("Normal args");
	}
	void display(int...x)
	{
		System.out.println("varargs");
	}
}
class Prog69 
{
	public static void main(String[] args) 
	{
		Demo ob=new Demo();
		ob.display(12,34);
	}
}
