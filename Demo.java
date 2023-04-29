class Demo 
{
	public static void main(String[] args)throws Exception 
	{
		System.out.println("Hello");
		Thread.sleep(5000);
		System.out.println("Kavali");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}