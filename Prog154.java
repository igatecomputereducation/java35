import java.util.*;
class Date 
{
	String str="igate solutions";
	public String toString()
	{
		return str;
	}
}
class Prog154 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		java.util.Date d2=new java.util.Date();
		System.out.println(d2);
	}
}