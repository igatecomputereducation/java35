class Manip
{
	int getSum(int...x)
	{
		int sum=0;
		for(int t:x)
			sum=sum+t;
		return sum;
	}
}
class Prog67 
{
	public static void main(String[] args) 
	{
		Manip ob=new Manip();
		System.out.println(ob.getSum(12,34,56,78,90));
	}
}