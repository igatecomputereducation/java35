class Queue<T>
{
	T[] q;
	int f,r;
	Queue(int size)
	{
		q=(T[])new Object[size];
		f=r=-1;
	}
	void add(T x)
	{
		if(r==q.length-1)
			System.out.println("Queue overflows");
		else
		{
			if(r==-1)
				f=r=0;
			else
				r++;
			q[r]=x;
		}
	}
	T remove()
	{
		T x=null;
		if(f==-1)
			System.out.println("Queue is empty");
		else if(f==r)
		{
			x=q[f];
			f=r=-1;
		}
		else
		{
			x=q[f];
			f++;
		}
		return x;
	}
	void display()
	{
		if(r==-1)
			System.out.println("Queue is empty");
		else
		{
			for(int i=f;i<=r;i++)
				System.out.print(q[i]+"\t");
			System.out.println();
		}
	}
}
class Prog189 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new Queue<Integer>(5);
		q.add(34);
		q.add(66);
		q.add(60);

		//q.display();

		int sum=0;
		while(true)
		{
			Integer t=q.remove();
			if(t==null)
				break;
			sum=sum+t;
		}
		System.out.println("Sum:"+sum);
	}
}