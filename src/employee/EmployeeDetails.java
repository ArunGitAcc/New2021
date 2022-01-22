package employee;

import JavaTest.Exam;

//class
public class EmployeeDetails {
// method 1
	
	private void empName()
	{
		System.out.println("Employee name is : ARUN");
	}
	
	
	//method 2
	private void empMobNo()
	{
		System.out.println("Employee Mob Number is : 9791111774");
	}
	
	// method 3
	private void empID()
	{
		System.out.println("Employee Id is : 123");
	}
	//main methods
	
	public static void main (String[]arg) 
	{
		//objects
		
		EmployeeDetails S= new EmployeeDetails();
		
		//methods calls
		S.empName();
		S.empMobNo();
		S.empID();
		
		bike Bi=new bike();
		Bi.bikeModel();
		Bi.bikeNo();
		
		Exam e=new Exam();
		e.Exam1();
		e.Exam2();
		
		
	}
	
}



