import java.util.*;
class Prog177 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 sides of a box");
		int b=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		assert (b>0 && h>0 && w>0):"problem with data";
		System.out.println("Volume:"+b*w*h);
	}
}