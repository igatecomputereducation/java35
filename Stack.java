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