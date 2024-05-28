package java_project1;

import java.util.Scanner;

public class Conditional_statemants {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age");
      int age = sc.nextInt();
      
      if(age>18) {
    	  System.out.println("Eligible for Vote"); 
      }
      else {
    	  System.out.println("not Eligible for Vote");
      }
		
	}

}
