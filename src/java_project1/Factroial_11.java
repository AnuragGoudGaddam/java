package java_project1;

import java.util.Scanner;

public class Factroial_11 {
	
	public static void factorial(int num) {
	    if (num < 0) {
	        System.out.println("Invalid Number");
	        return;
	    }
	    
	    int factorial = 1;
	    
	    for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
	    }
	    
	    System.out.println(factorial);
	}

	public static void main(String[] args) {
		
		System.out.println("Entert the value");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		factorial(num);
		
		
	}

}
