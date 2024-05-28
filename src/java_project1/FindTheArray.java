package java_project1;

import java.util.Scanner;

public class FindTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size= sc.nextInt();
		int number[] = new int[size]; 
		
		System.out.println("Enter the Values");
		for(int i=0; i<size ;i++) {
			number[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value X");
		int x= sc.nextInt();
		
		for(int i=0;i<number.length;i++) {
			if (number[i]==x) {
				System.out.println("X is found at :"+ i);
				return;
			}
			else {
				System.out.println("Enter valid value :");
			}
			
		}
	}

}
