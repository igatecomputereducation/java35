class Prog181 
{
	public static void main(String[] args) 
	{
		double x,y,z;
		x=12.0/0.0;
		y=-12.0/0.0;
		z=0.0/0.0;
		System.out.println(Double.isInfinite(x));
		System.out.println(Double.isInfinite(y));
		System.out.println(Double.isNaN(z));
		System.out.println(x==Double.POSITIVE_INFINITY);
		System.out.println(y==Double.NEGATIVE_INFINITY);

		String str="12.45";
		float a=Float.parseFloat(str);
		float b=Float.valueOf(str).floatValue();
		System.out.println(a+b);
	}
}