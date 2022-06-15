package assignment4;

/*Inheritance
Create a class ‘Teacher’ which contains following variables and methods
designation = “Teacher”; 
collegeName = “BusyQA”;
does() -> Teaching

Create another class ‘ComputerTeacher’ which extends ‘Teacher’ class then create objects then
call methods.*/

public class Teacher {
	String designation = "Teacher";
	String collegeName = "BusyQA";
	public void does() {
		System.out.println("The " + designation + " in " + collegeName + " does teaching.");
	}

}
