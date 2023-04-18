class Display
{
	void dispData(int[] x)
	{
		for(int t:x)
			System.out.println(t);
	}
}
class Prog73 
{
	public static void main(String[] args) 
	{
		/*
		int[] a=new int[]{10,20,30,40,50};
		Display d=new Display();
		d.dispData(a);
		*/	
		new Display().dispData(new int[]{10,20,30,40,50});
	}
}
