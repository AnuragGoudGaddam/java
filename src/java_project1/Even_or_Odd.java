package java_project1;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter the Value");
    int num = sc.nextInt();
    
    if (num%2==0) {
		System.out.println("The Number is Even :"+num);
	}
    else {
		System.out.println("The Number is Odd :"+num);
	}
    
	}

}
