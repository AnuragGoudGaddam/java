package java_project1;

import java.util.Scanner;

public class ElseIF_Example {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value :");
    int a  = sc.nextInt();
    System.out.println("Enter b value :");
    int b = sc.nextInt();
     
    if (a>b) {
		System.out.println(a+ ">"+ b + "The value a is grather than b" );
	} 
    else if(a<b) {
		
		System.out.println("a is lessthan b");
	}
	else {
		
		System.out.println("a is equal to b ");
	}
    
	}

}
