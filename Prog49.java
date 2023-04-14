class Box
{
	int getVolume(int b,int w,int h)
	{
		return b*w*h;
	}
}
class Prog49 
{
	public static void main(String[] args) 
	{
		Box ob=new Box();
		System.out.println("Volume of box:"+ob.getVolume(4,5,6));
	}
}