package java_project1;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
	     int a =sc.nextInt();		
	     int n = 0 ;
		for(int i=0;i<=a;i++) {
			System.out.println(i);
			n=n+i;
		}
		System.out.println(n);
	}

}
