import java.util.*;
class Prog19 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Price:");
		float price=sc.nextFloat();
		System.out.print("Quantity:");
		int qty=sc.nextInt();
		float bill=price*qty;
		float dis=(bill>=5000)?bill*5/100:bill*2/100;
		float nbill=bill-dis;
		System.out.println("Bill:"+bill);
		System.out.println("Discount:"+dis);
		System.out.println("Net bill:"+nbill);
	}
}
