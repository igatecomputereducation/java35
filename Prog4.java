import java.util.*;
class Prog4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		float price,bill;
		int qty;

		System.out.printf("Price:");
		price=sc.nextFloat();
		System.out.printf("Quantity:");
		qty=sc.nextInt();
		bill=price*qty;

		System.out.printf("Total bill %f\n");
	}
}