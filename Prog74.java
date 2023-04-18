class Demo
{
	void dispRef()
	{
		System.out.println(this);
	}
	Demo getRef()
	{
		return this;
	}
}
class Prog74 
{
	public static void main(String[] args) 
	{
		Demo ob=new Demo();
		System.out.println(ob);
		ob.dispRef();
		if(ob==ob.getRef())
			System.out.println("Same");
		else
			System.out.println("Not same");
	}
}
