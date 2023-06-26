class Prog175 
{
	public static void main(String[] args) 
	{
		try{
			//System.out.println("Division:"+25/5);
			//System.out.println("Division:"+25/0);
			String str="125xyz";
			System.out.println(Integer.parseInt(str)/5);
		}
		catch(ArithmeticException ne)
		{
			System.out.println(ne);
		}
		finally{
			System.out.println("In finally block");
		}
	}
}