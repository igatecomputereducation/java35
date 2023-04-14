class Data
{
	void process(int[] y)
	{
		for(int i=0;i<y.length;i++)
			y[i]=y[i]+5;
	}
}
class Prog65 
{
	public static void main(String[] args) 
	{
		int[] x=new int[]{10,20,30,40,50};
		Data ob=new Data();
		ob.process(x);
		for(int t:x)
			System.out.print(t+"\t");
		System.out.println();
	}
}
