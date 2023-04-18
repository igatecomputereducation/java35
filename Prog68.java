class Collection
{
	private int[] x;
	void setCollection(int...p)
	{
		x=p;
	}
	int getSum()
	{
		int sum=0;
		for(int t:x)
			sum=sum+t;
		return sum;
	}
	int getMin()
	{
		int min=x[0];
		for(int t:x)
		{
			if(t<min)
				min=t;
		}
		return min;
	}
	int getMax()
	{
		int max=x[0];
		for(int t:x)
		{
			if(t>max)
				max=t;
		}
		return max;
	}
}
class Prog68 
{
	public static void main(String[] args) 
	{
		Collection c=new Collection();
		c.setCollection(34,56,12,2);
		System.out.println("Sum:"+c.getSum());
		System.out.println("Minimum:"+c.getMin());
		System.out.println("Maximum:"+c.getMax());
	}
}
