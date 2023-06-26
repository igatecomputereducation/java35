class Prog196 
{
	public static void main(String[] args) 
	{
		String s1="igate";
		String s2="igate";
		if(s1.hashCode()==s2.hashCode())
			System.out.println("Refers same object");
		else
			System.out.println("Refer diff. objects");
	}
}
