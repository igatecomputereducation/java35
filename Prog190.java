class Box<T extends Number>
{
	T b,w,h;
	void setSides(T b,T w,T h)
	{
		this.b=b;
		this.w=w;
		this.h=h;
	}
	double getVolume()
	{
		return ((Number)b).doubleValue()*
					((Number)w).doubleValue()*
							((Number)h).doubleValue();
	}
}
class Prog190 
{
	public static void main(String[] args) 
	{
		Box<Integer> ob=new Box<Integer>();
		ob.setSides(12,45,67);
		System.out.println("Volume:"+ob.getVolume());
	}
}