class BillingException extends Exception
{
	BillingException(String msg)
	{
		super(msg);
	}
}
class Prog173 
{
	public static void main(String[] args)
	{
		float price=-45.50f;
		int qty=12;
		try{
			if(price<1 || qty<1)
				throw new BillingException("Invalid data");
			float bill=price*qty;
			System.out.println("Total bill:"+bill);
		}
		catch(BillingException be)
		{
			System.out.println(be.getMessage());
		}
	}
}