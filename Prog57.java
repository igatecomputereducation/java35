class Rect
{
	int l,b;
	int getArea()
	{
		return l*b;
	}
	int getPeri()
	{
		return 2*(l+b);
	}
}
class Prog57 
{
	public static void main(String[] args) 
	{
		Rect ob=new Rect();
		ob.l=5;
		ob.b=6;
		System.out.println("Area:"+ob.getArea());
		System.out.println("Perimeter:"+ob.getPeri());
	}
}
