package java_project1;

import java.util.Iterator;

public class Pattern2 {

	public static void main(String[] args) {
		int n= 5 ;
		 for(int i=n; i>=1; i--) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
//		 inverted 
		
        inverted();
        straight();

	}
 static void inverted() {
	int n=5;
	 for(int i=1; i<=n; i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
}
 static void straight() {
	 
		int n=5;
		 for(int i=1; i<=n; i++) {
			 for(int j=1;j<=i;j--) {
				 System.out.print(" ");
			 }
			 for(int j=1;j>=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
}
