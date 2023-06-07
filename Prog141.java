interface A
{
	void first();
	void second();
}
abstract class B implements A
{
	public void first()
	{
		System.out.println("In first");
	}
}
class C extends B
{
	public void second()
	{
		System.out.println("In second");
	}
}
class Prog141 
{
	public static void main(String[] args) 
	{
		A ob=new C();
		ob.first();
		ob.second();
	}
}