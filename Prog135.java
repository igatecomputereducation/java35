class Person
{
	protected String name;
	Person(String name)
	{
		this.name=name;
	}
	void printDetails()
	{
		System.out.println("Name:"+name);
	}
}
class Student extends Person
{
	protected String course;
	Student(String name,String course)
	{
		super(name);
		this.course=course;
	}
	void printDetails()
	{
		super.printDetails();
		System.out.println("Course:"+course);
	}
}
class Emp extends Person
{
	protected int sal;
	Emp(String name,int sal)
	{
		super(name);
		this.sal=sal;
	}
	void printDetails()
	{
		super.printDetails();
		System.out.println("Salary:"+sal);
	}
}
class Prog135 
{
	public static void main(String[] args) 
	{
		Emp ob1=new Emp("Ravi",25000);
		ob1.printDetails();

		System.out.println("-".repeat(20));

		Student ob2=new Student("Mallika","B.Sc");
		ob2.printDetails();
	}
}
