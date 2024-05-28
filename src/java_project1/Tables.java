package java_project1;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
	System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int a=1;a<11;a++) {
			System.out.println(t*a);
		}
		

	}

}
