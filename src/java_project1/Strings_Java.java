package java_project1;

import java.util.Scanner;

public class Strings_Java {

	public static void main(String[] args) {
		
           Scanner sc= new Scanner(System.in);
           
           //For a single word "string" input  use sc.next
           System.out.println("Enter the name");
           String name=sc.next();           
           System.out.println(name);
   
           // for full line input use sc.nextLine
           System.out.println("Enter the fullname ");
           String full_name= sc.nextLine();
           System.out.println(full_name);
	}
}
