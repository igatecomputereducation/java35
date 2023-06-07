class First
{
	void dispFirst()
	{
		System.out.println("first");
	}
}
class Second
{
	void dispSecond()
	{
		System.out.println("Second");
	}
}
class Disp
{
	First f;
	Second s;
	Disp()
	{
		f=new First();
		s=new Second();
	}
	void display()
	{
		f.dispFirst();
		s.dispSecond();
	}
}
class Prog114 
{
	public static void main(String[] args) 
	{
		Disp ob=new Disp();
		ob.display();
	}
}