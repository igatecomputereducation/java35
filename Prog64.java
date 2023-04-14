class Box
{
	int getVolume(int b)
	{
		return b*b*b;
	}
	int getVolume(int b,int w,int h)
	{
		return b*w*h;
	}
}
class Prog64 
{
	public static void main(String[] args) 
	{
		Box ob=new Box();
		System.out.println("Volume of cube:"+ob.getVolume(3));
		System.out.println("Volume of box:"+ob.getVolume(4,5,6));
	}
}
