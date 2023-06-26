class Prog180 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE+" bits");
		System.out.println(Integer.BYTES+" Bytes");
		System.out.println(Integer.sum(10,20));
		System.out.println(Integer.max(45,20));
		System.out.println(Integer.min(45,20));

		String str="1234";
		System.out.println(Integer.parseInt(str)*2);

		Integer i=Integer.valueOf(str);
		System.out.println(i.intValue()*2);

		System.out.println(Integer.toHexString(98786));
		System.out.println(Integer.toOctalString(98786));
		System.out.println(Integer.toBinaryString(98786));
	}
}
