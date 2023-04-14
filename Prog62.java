class Data
{
	void display(int x)
	{
		System.out.println("Integer:"+x);
	}
	void display(String x)
	{
		System.out.println("String:"+x);
	}
	void display(boolean x)
	{
		System.out.println("boolean:"+x);
	}
}
class Prog62 
{
	public static void main(String[] args) 
	{
		Data ob=new Data();
		ob.display(true);
		ob.display(425);
		ob.display("hello");
	}
}
