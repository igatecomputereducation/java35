class Employee
{
	int sno;
	String name;
	int sal;
	Employee(int sno,String name,int sal)
	{
		this.sno=sno;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public int hashCode()
	{
		return sno;
	}
	@Override
	public boolean equals(Object o)
	{
		return sno==((Employee)o).sno;
	}
	@Override
	public String toString()
	{
		return sno+":"+name+":"+sal;
	}
	@Override
	public Object clone()
	{
		Employee e=new Employee(sno,name,sal);
		return e;
	}
}
class Prog179 
{
	public static void main(String[] args) 
	{
		Employee ob1=new Employee(1000,"Rakesh",25000);
		Employee ob2=new Employee(1001,"Suresh",30000);

		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());

		if(ob1.equals(ob2))
			System.out.println("Same Object");
		else
			System.out.println("Different objects");
		
		System.out.println(ob1);
		System.out.println(ob2);
		
		Employee ob3=(Employee)ob1.clone();
		System.out.println(ob3);
	}
}
