class Prog184 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Object i1=new Integer(45);
		Object i2=new Integer(50);

		int sm=((Integer)i1).intValue()+((Integer)i2).intValue();
		System.out.println("Sum:"+sm);
	}
}
