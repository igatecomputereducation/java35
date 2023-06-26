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