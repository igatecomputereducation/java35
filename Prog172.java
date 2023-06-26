class BillingException extends Exception
{
	BillingException(String msg)
	{
		super(msg);
	}
}
class Billing
{
	void printBill(float price,int qty)throws BillingException
	{
		if(price<1 || qty<1)
			throw new BillingException("Invalid data");
		float bill=price*qty;
		float dis=bill*5/100;
		float nbill=bill-dis;
		System.out.println("Bill:"+bill);
		System.out.println("Discount:"+dis);
		System.out.println("Netbill:"+nbill);
	}
}
class Prog172
{
	public static void main(String[] args)//throws BillingException
	{
		Billing ob=new Billing();
		try{
			ob.printBill(-45.50f,12);
		}
		catch(BillingException b)
		{
			System.out.println(b.getMessage());
		}
	}
}