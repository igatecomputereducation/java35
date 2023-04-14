class Rect
{
	private int l,b;
	void setSides(int x,int y)
	{
		l=x;
		b=y;
	}
	int getArea()
	{
		return l*b;
	}
	int getPeri()
	{
		return 2*(l+b);
	}
}
class Prog58
{
	public static void main(String[] args) 
	{
		Rect ob=new Rect();
		//ob.l=5;
		//ob.b=6;
		ob.setSides(5,6);
		System.out.println("Area:"+ob.getArea());
		System.out.println("Perimeter:"+ob.getPeri());
	}
}
