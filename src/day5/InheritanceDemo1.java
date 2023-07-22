package day5;

//Inheritance - we are inheriting the two class one is base class and other is child class
// Base class
class Person{
//	protected - derive class me use kar sakte he not for any other class
	protected String name;
	protected int age;
	
//	default contructor
	Person(){}
	
	Person(String n,int a){
		name=n;
		age=a; 
   }
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return ("Name:"+ name+  " "+age);
	}
	
	
	
}
//child class using the variable of person class
//the extends keyword is used to indicate that the class 
//which is being defined is derived from the base class using inheritance
//child class
class Employee extends Person{
	

int id;
	double sal;
	

	Employee(){
		super(); //	calling the base class constructor it is optional
	}
      Employee(String name, int age,int id, double sal) {
		//this.name=name;
		//this.age=age;
//    	  super is used to call the data types of parent class
		super(name,age);
		this.id=id;
		this.sal=sal;
		//super(name,age);
	}
      
	public String  toString() {
	//System.out.println("Name:"+ name+  " "+age);
//		It is used to call superclass methods, and to access the superclass constructor. 
//		The most common use of the super keyword is to eliminate the confusion between 
//		superclasses and subclasses that have methods with the same name.
		// super.print();	
		return super.toString()+ (id+" "+ sal);
	}
}
class Student extends Person{
	
	int roll;
	Student(String name,int age,int roll){
		super(name,age);
		this.roll=roll;
	}
	
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person x=new Person("Ravi", 20);
		//x.print();
		System.out.println(x);
		Employee y=new Employee("Ram", 20,101,20000);
		//y.set("Ram", 20,10,200000);
		//y.set(101, 20000);
		//y.print();
		System.out.println(y);
		
		Student z=new Student("Zaiba",30,120);
		
		System.out.println(z);
		
		if(z.getAge()>y.getAge())  
		System.out.print(z.getName()+" is elder");
		else
		System.out.println(y.getName()+ "is elder");

	}
	}
	
