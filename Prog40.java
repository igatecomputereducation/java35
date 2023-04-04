class product
{
  int sno;
  String pname;
  float price;
  int qty;
  float amt;
};
class Prog40
{
	public static void main(String[] args) 
	{
		product x;
		x=new product();
		x.sno=1;
		x.pname="Lux";
		x.price=45.50f;
		x.qty=15;
		x.amt=x.price*x.qty;
		System.out.printf("%d\t%s\t%f\t%d\t%f\n",
			x.sno,x.pname,x.price,x.qty,x.amt);
	}
}
