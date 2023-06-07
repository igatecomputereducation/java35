interface Hello
{
	void first();
	void second();
}
class Prog144 
{
	public static void main(String[] args) 
	{
		Hello ob=new Hello(){
			public void first()
			{
				System.out.println("Hello first");
			}
			public void second()
			{
				System.out.println("Hello second");
			}
		};
		ob.first();
		ob.second();
	}
}