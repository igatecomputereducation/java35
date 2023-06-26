import java.util.*;
class Prog186 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		/*
		list.add(new Integer(45));
		list.add(new Integer(60));
		list.add(new Integer(75));
		list.add(new Integer(90));
		*/


		//no type safety because this code compiles
		/*
		list.add(new Integer(45));
		list.add(new Double(60));
		list.add("igate");
		list.add(new Student("subbu","B.Tech"));
		*/

		int sum=0;
		for(Object t:list)
		{
			sum=sum+((Integer)t).intValue();
		}

		System.out.println("Sum:"+sum);
	}
}
