import java.util.*;
class Prog5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int b,w,h,v;
		System.out.printf("Enter 3 sides of a box..\n");
		b=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		v=b*w*h;
		System.out.printf("Volume %d\n",v);
	}
}