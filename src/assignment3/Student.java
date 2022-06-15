package assignment3;

public class Student {
	/*1. Create a Student class contains the following variables and methods.
	Class Name: Student
	Variables: SID, Sname, Sub1, Sub2, Sub3
	Methods:
	getStuData() Takes student details SID and Sname as parameters and assign them to variables.
	getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
	totalMarks() Calculate total marks and print the student details with total marks. 

	Now, create objects from Student class stu1, stu2 etc. Then call Student class methods.
	*/
		private int SID, Sub1, Sub2, Sub3;
		private String Sname;
		
		public void getStuData(int SID, String Sname){
			this.SID = SID;
			this.Sname= Sname;
		}

		public void getStuMarks(int Sub1, int Sub2, int Sub3) {
			this.Sub1= Sub1;
			this.Sub2= Sub2;
			this.Sub3= Sub3;
		}
		public int totalMarks() {
				int totalMarks= 0;
				totalMarks = Sub1 + Sub2 + Sub3;
				return totalMarks;
				
		}
		public String toString() {
			return "Student id = " + this.SID + " Student name: " + this.Sname + " Total Marks: " + (totalMarks()) ;
		}
		public static void main(String[] args) {
			Student stu1= new Student();
			stu1.getStuData(1, "NIRMAL");
			stu1.getStuMarks(100, 80, 90);
			stu1.totalMarks();
			System.out.println(stu1);
			
			Student stu2= new Student();
			stu2.getStuData(2, "JOANNE");
			stu2.getStuMarks(60, 70, 80);
			stu2.totalMarks();
			System.out.println(stu2);
			
			Student stu3= new Student();
			stu3.getStuData(3, "JANE");
			stu3.getStuMarks(70, 60, 70);
			stu3.totalMarks();
			System.out.println(stu3);
		}
}
