class Student
{
	protected String name,res;
	protected int mat,phy,che,tot;
	protected float avg;
	void setMarks(String name,int mat,int phy,int che)
	{
		this.name=name;
		this.mat=mat;
		this.phy=phy;
		this.che=che;
	}
	void calculate()
	{
		tot=mat+phy+che;
		avg=(float)tot/3;
		if(mat<35 || phy<35 || che<35)
			res="failed";
		else if(avg>=75)
			res="Distinction";
		else if(avg>=60)
			res="First class";
		else
			res="passed";
	}
	void printRes()
	{
		System.out.println("Total:"+tot+"\nAverage:"+avg);
		System.out.println("Result:"+res);
	}
}
class NewStudent extends Student
{
	@Override
	void calculate()
	{
		tot=mat+phy+che;
		avg=(float)tot/3;
		if(mat>=60 && phy>=60 && che>=60 && avg>=75)
			res="certified";
		else
			res="Not certified";
	}
}
class Prog126 
{
	public static void main(String[] args) 
	{
		//Student s=new Student();
		NewStudent s=new NewStudent();
		s.setMarks("Jagan",61,67,78);
		s.calculate();
		s.printRes();
	}
}