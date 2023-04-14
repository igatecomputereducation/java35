import java.util.*;
class Shape
{
	boolean isSquare(int l,int b)
	{
		return l==b;
	}
}
class Prog51 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Shape s=new Shape();
		
		System.out.println("Enter 2 sides of a shape..");
		int x=sc.nextInt();
		int y=sc.nextInt();

		if(s.isSquare(x,y))
			System.out.println("Square");
		else
			System.out.println("Rectangle");
	}
}
