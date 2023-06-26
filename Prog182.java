import java.util.*;
class Prog182
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Num:");
		float x=sc.nextFloat();
		System.out.print("Den:");
		float y=sc.nextFloat();
		float div=x/y;
		if(div==Float.POSITIVE_INFINITY)
			System.out.println("Positive infinity");
		else if(div==Float.NEGATIVE_INFINITY)
			System.out.println("Negative infinity");
		else if(Float.isNaN(div))
			System.out.println("Not a number");
		else
			System.out.println("Division:"+div);

	}
}
