class Prog176 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("hello");
			System.exit(0);
			System.out.println("world");
		}
		finally{
			System.out.println("In finally block");
		}
	}
}