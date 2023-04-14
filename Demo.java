class Data
{
	int getData()
	{
		return 10;
	}
	String getData()
	{
		return "hello";
	}
}
class Demo 
{
	public static void main(String[] args) 
	{
		Data ob=new Data();
		int x=ob.getData();
		String y=ob.getData();
		System.out.println(x);
		System.out.println(y);
	}
}