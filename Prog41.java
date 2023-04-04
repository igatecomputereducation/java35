import java.util.*;
class Circle
{
	int rad;
	double area,cir;
};
class Prog41 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.print("Radius:");
		c.rad=sc.nextInt();
		c.area=3.14*c.rad*c.rad;
		c.cir=2*3.14*c.rad;
		System.out.println("Area:"+c.area);
		System.out.println("Circumference:"+c.cir);
	}
}
