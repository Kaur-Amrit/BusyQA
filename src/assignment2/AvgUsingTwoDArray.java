package assignment2;

public class AvgUsingTwoDArray {
	public static void main(String[] args) {
		int Marks[][]= {
				{81,82,93,74},
				{95,96,87,78}
			};
		
		int sum, stu=1;
		double  avg;
		for(int a[]: Marks) {
			sum= 0; avg= 0;
			for(int x: a) {
				sum=sum+x;
				avg=(double)sum/(a.length);
			}
			System.out.println("The average marks in given subjects for student " + stu + " is: " + avg);
			stu++;
		}
	}
}
