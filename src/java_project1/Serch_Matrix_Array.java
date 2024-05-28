package java_project1;

import java.util.Scanner;

public class Serch_Matrix_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int rowss=sc.nextInt();
		System.out.println("Enter the columns :");
		int colss=sc.nextInt();	
		
		int [][] matrix= new int[rowss][colss];		
		
		for(int i=0;i<rowss;i++) {
			for(int j=0;j<colss;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<rowss;i++) {
			for(int j=0;j<colss;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the x value");
		int x=sc.nextInt();
		
		for (int i=0;i<rowss;i++) {
			for(int j=0;j<colss;j++) {
				if (x==matrix[i][j]) {
					System.out.println("The x matrix value is :" + i +','+ j);
					
				}
				
			}
		}
		
	}
	
}
