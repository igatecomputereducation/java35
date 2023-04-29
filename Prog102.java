class Rect
{
	private int l,b;
	void setSides(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void printResult()
	{
		System.out.println("Area:"+l*b);
	}
}
class Prog102 
{
	public static void main(String[] args) 
	{
		Rect ob=new Rect();
		ob.setSides(3,4);
		ob.printResult();
	}
}
