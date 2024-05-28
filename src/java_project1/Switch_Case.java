package java_project1;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the button");
		
		int button = sc.nextInt();
		
		switch(button) {
		case 1:System.out.println("Hello");
		break;
		case 2:System.out.println("Namaste"); 
		break;
		case 3:System.out.println("Bonjur");
		break;		
		default:System.out.println("You have pressed the wrong button");
		}
		
	}

}
