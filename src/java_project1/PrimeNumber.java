package java_project1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the NUmber");
		 int num = sc.nextInt();
		 
		 if(num%2==0)
		 {
		 System.out.println("prime number");
		 }
		 else {
			 System.out.println("Non Prime");
		 }

	}

}
