import java.util.*;
class Prog6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int rad;
		double area,cir;

		System.out.printf("Radius:");
		rad=sc.nextInt();

		area=Math.PI*Math.pow(rad,2);
		cir=2*Math.PI*rad;

		System.out.printf("Area %.2f\n",area);
		System.out.printf("Circumference %.2f\n",cir);
	}
}