class Collection
{
	private int[] y;
	void setCollection(int[] a)
	{
		y=a;
	}
	int getSum()
	{
		int sum=0;
		for(int t:y)
			sum=sum+t;
		return sum;
	}
	int getEvenSum()
	{
		int esum=0;
		for(int t:y)
		{
			if(t%2==0)
				esum=esum+t;
		}
		return esum;
	}
	int getOddSum()
	{
		int osum=0;
		for(int t:y)
		{
			if(t%2==1)
				osum=osum+t;
		}
		return osum;
	}
}
class Prog66 
{
	public static void main(String[] args) 
	{
		int[] x=new int[]{12,45,22,33,18,67,88};
		Collection c=new Collection();
		c.setCollection(x);
		System.out.println("Sum of all:"+c.getSum());
		System.out.println("Sum of even:"+c.getEvenSum());
		System.out.println("Sum of odd:"+c.getOddSum());
	}
}
