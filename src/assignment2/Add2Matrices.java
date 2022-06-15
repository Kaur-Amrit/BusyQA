package assignment2;

public class Add2Matrices {
	
	public static void main(String[] args) {
	System.out.println("**************************************************************************");
	
	System.out.println("Java program to add 2 matrices using 2-D array.");
	int matrix1[][]= {
		{1,2,3,4},
		{5,6,7,8}
	};
	int matrix2[][]= {
			{7,8,9,10},
			{5,6,7,8}
		};
	int sum=0;
	int matrixSum[][]= new int[2][4]; //allotting memory to the resultant matrix
	for(int i=0; i<2; i++) {
		for(int j=0; j<4; j++) {
		matrixSum[i][j]= (matrix1[i][j]) + (matrix2[i][j]);
		}
	}
	System.out.println("The result of adding the two given matrices is: ");
	for(int x[]: matrixSum) {
		for(int y: x) {
			System.out.print(y + " ");		
		}
		System.out.println();
	}
	}
}
