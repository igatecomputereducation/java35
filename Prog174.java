class Prog174 
{
  public static void main(String[] args) 
  {
	try{
		
		//System.out.println("division:"+5/0);
		
		int[] a=new int[]{10,20,30,40,50};
		System.out.println(a[10]);
		
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
  }
}