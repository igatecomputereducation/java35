class Cube
{
	protected int b;
	void setSides(int b)
	{
		this.b=b;
	}
	int cubeVolume()
	{
		return b*b*b;
	}
}
class Box extends Cube
{
	private int w,h;
	void setSides(int b,int w,int h)
	{
		this.b=b;
		this.w=w;
		this.h=h;
	}
	int boxVolume()
	{
		return b*w*h;
	}
}
class Prog123 
{
	public static void main(String[] args) 
	{
		Box ob=new Box();
		ob.setSides(3);
		System.out.println("Cube volume:"+ob.cubeVolume());

		ob.setSides(4,5,6);
		System.out.println("Box volume:"+ob.boxVolume());
	}
}
