class Prog182
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		//Boxing
		Integer i1=new Integer(45);
		Integer i2=new Integer(50);

		//Unboxing
		int sm=i1.intValue()+i2.intValue();
		System.out.println("Sum:"+sm);
	}
}