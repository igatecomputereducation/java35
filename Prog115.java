class Disp
{
	private class First
	{
		void dispFirst()
		{
			System.out.println("first");
		}
	}
	First f;
	Disp()
	{
		f=new First();
	}
	void display()
	{
		f.dispFirst();
	}
}
class Prog115
{
	public static void main(String[] args) 
	{
		Disp ob=new Disp();
		ob.display();
	}
}