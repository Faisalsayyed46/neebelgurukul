package day4;

class Employee{
	String name;
	int employeid;
	double salary;
	String department;
	
	Employee(String name,int employeid,int salary,String department)
	{
		this.name=name;
		this.employeid=employeid;
		this.salary=salary;
		this.department=department;
	}
	public String getname()
	{
		return this.name;
	}
	public int getemployeid()
	{
		return employeid;
	}
	public double getsalary()
	{
		return salary;
	}
	public String getdepartment()
	{
		return department;
	}
	void setsalary(double salary)
	{
		this.salary=salary;
	}
	public String toString()
	{
		return "\n name" + name + "employeid" +employeid + "salary" + salary + "department" + department;
	}
}

public class q1 {
	public static void main(String[] args) {
		
		Employee x;
		x=new Employee("A",12,20000,"Eng");
		Employee y=new Employee("B",13,30000,"Eng1");
		Employee z=new Employee("C",14,40000,"Eng2");
		Employee max=x;
		if(max.getsalary()<y.getsalary())
		max=y;
		if(max.getsalary()<z.getsalary())
			max=z;
		System.out.println( "Employe name" + " " +max.getname());
		
		x.setsalary(x.getsalary()+x.getsalary()*(20.0/100));
		y.setsalary(y.getsalary()+y.getsalary()*(20.0/100));
		z.setsalary(z.getsalary()+z.getsalary()*(20.0/100));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
