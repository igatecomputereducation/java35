class Box
{
	private int b,w,h;
	Box(int b,int w,int h)
	{
		this.b=b;
		this.w=w;
		this.h=h;
	}
	@Override
	public String toString()
	{
		return "volume:"+b*w*h;
	}
}
class Prog165 
{
	public static void main(String[] args)
	{
		Box ob=new Box(3,4,5);
		System.out.println(ob);
	}
}
