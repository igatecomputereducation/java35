import java.util.*;
class Rectangle
{
	void printOutput(int len,int bre)
	{
		System.out.println("Area:"+len*bre);
		System.out.println("Perimeter:"+2*(len+bre));
	}
}
class Prog47 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		System.out.print("Length:");
		int l=sc.nextInt();
		System.out.print("Breadth:");
		int b=sc.nextInt();
		r.printOutput(l,b);
	}
}
