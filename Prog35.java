class Prog35 
{
	public static void main(String[] args) 
	{
		int[] x=new int[]{10,20,30,40,50};
		int[] y=x;

		for(int i=0;i<y.length;i++)
			y[i]=y[i]+5;

		System.out.println("Elements of original array..");
		for(int t:x)
			System.out.print(t+"\t");

		System.out.println();
	}
}
