class Manip
{
	int adding(int x,int y)
	{
		return x+y;
	}
}
class Prog46 
{
	public static void main(String[] args) 
	{
		Manip m=new Manip();
		int sm=m.adding(12,34);
		System.out.println("Sum:"+sm);
	}
}
