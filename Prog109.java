class Prog109 
{
	public static void main(String[] args) 
	{
		//Runtime r=new Runtime();
		Runtime r=Runtime.getRuntime();
		System.out.println("Total memory:"+r.totalMemory());
		System.out.println("Free memory:"+r.freeMemory());
	}
}