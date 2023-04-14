class Data
{
	void display(int x,String y)
	{
		System.out.println("integer:"+x);
		System.out.println("String:"+y);
	}
	void display(String x,int y)
	{
		System.out.println("String:"+x);
		System.out.println("integer:"+y);
	}
}
class Prog63 
{
	public static void main(String[] args) 
	{
		Data ob=new Data();
		ob.display(10,"hello");
		ob.display("igate",100);
	}
}
