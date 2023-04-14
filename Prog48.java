class Circle
{
	double getArea(int r)
	{
		return 3.14*r*r;
	}
	double getCir(int r)
	{
		return 2*3.14*r;
	}
}
class Prog48 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		double area=c.getArea(7);
		double cir=c.getCir(7);
		System.out.println("Area:"+area);
		System.out.println("Circumference:"+cir);
	}
}
