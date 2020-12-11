import java.util.Scanner;
class Person
{
	String firstName,lastName;
	int age;
	public void getDetail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Details");
		System.out.println("Enter the First Name");
		firstName=sc.next();
		System.out.println("Enter the Last Name");
		lastName=sc.next();
		System.out.println("Enter the Age");
		age=sc.nextInt();
	}
}
class Employee extends Person
{
	double salary;
	String dept,desg,eid;
	public void getDetail()
	{
		super.getDetail();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Professional Details");
		System.out.println("Enter the Department");
		dept=sc.next();
		System.out.println("Enter the Designation");
		desg=sc.next();
		System.out.println("Enter the Employee ID");
		eid=sc.next();
		System.out.println("Enter the Salary");
		salary=sc.nextDouble();
	}
	public void showDetail()
	{
		System.out.println("\nThe details entered are: \n");
		System.out.println("First Name: "+super.firstName);
		System.out.println("Last Name: "+super.lastName);
		System.out.println("Age: "+super.age);
		System.out.println("Department: "+dept);
		System.out.println("Designation: "+desg);
		System.out.println("Employee ID: "+eid);
		System.out.println("Salary: "+salary);
	}
}
class Student extends Person
{
	String course,sid;
	public void getDetail()
	{
		super.getDetail();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Academic Details");
		System.out.println("Enter the Course enrolled");
		course=sc.next();
		System.out.println("Enter the Student ID");
		sid=sc.next();
	}
	public void showDetail()
	{
		System.out.println("\nThe details entered are: \n");
		System.out.println("First Name: "+super.firstName);
		System.out.println("Last Name: "+super.lastName);
		System.out.println("Age: "+super.age);
		System.out.println("Course Enrolled: "+course);
		System.out.println("Student ID: "+sid);
	}
}
public class Intro5_1
{
	public static void main(String args[])
	{
		int option;
		String ans;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("MENU");
			System.out.println("1. Student Details");
			System.out.println("2. Employee Details");
			System.out.println("Enter the choice:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
					Student st=new Student();
					st.getDetail();
					st.showDetail();
					break;
				case 2: 
					Employee emp=new Employee();
					emp.getDetail();
					emp.showDetail();
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue?(Y/N)");
			ans=sc.next();
		}while(ans.equalsIgnoreCase("y"));
	}
}
