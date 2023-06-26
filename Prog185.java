class Stack
{
	Object[] s;
	int top;
	final int max=5;
	Stack(int size)
	{
		s=new Object[size];
		top=-1;
	}
	void push(Object x)
	{
		if(top==s.length-1)
			System.out.println("Stack overflows");
		else
		{
			top++;
			s[top]=x;
		}
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	Object pop()
	{
		Object x=s[top];
		top--;
		return x;
	}
	void display()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.print(s[i]+"\t");
			System.out.println();
		}
	}
}
class Student
{
	String name;
	String course;
	Student(String name,String course)
	{
		this.name=name;
		this.course=course;
	}
	void printDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
	}
}
class Prog185 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Stack ob=new Stack(5);
		/*
		ob.push(new Integer(40));
		ob.push(new Integer(80));
		ob.push(new Integer(75));
		
		while(!ob.isEmpty())
		{
			System.out.println(((Integer)ob.pop()).intValue());
		}
		*/

		/*
		ob.push("igate");
		ob.push("kavali");
		ob.push("java");

		while(!ob.isEmpty())
		{
			System.out.println((String)ob.pop());
		}
		*/


		ob.push(new Student("Dhruva","B.Tech"));
		ob.push(new Student("Rama","B.Sc"));
		ob.push(new Student("Lakshmana","B.Com"));

		while(!ob.isEmpty())
		{
			((Student)ob.pop()).printDetails();
		}
	}
}