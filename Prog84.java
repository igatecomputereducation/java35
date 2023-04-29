class Box
{
	private int b,w,h;
	Box()
	{
		b=w=h=0;
	}
	Box(int x)
	{
		b=w=h=x;
	}
	Box(int x,int y,int z)
	{
		b=x;
		w=y;
		h=z;
	}
	int getVolume()
	{
		return b*w*h;
	}
}
class Prog84 
{
	public static void main(String[] args) 
	{
		Box ob1=new Box();
		Box ob2=new Box(3);
		Box ob3=new Box(4,5,6);
		System.out.println(ob1.getVolume());
		System.out.println(ob2.getVolume());
		System.out.println(ob3.getVolume());
	}
}
