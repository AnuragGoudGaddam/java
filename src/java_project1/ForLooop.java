package java_project1;

import java.util.Iterator;

public class ForLooop {

	public static void main(String[] args) {
		
		int a =1;
		
		
		for(  a = 0; a<=10;a++) {
			System.out.println("for loop"+"a"+"="+ a);
		}
		
//		While Loop
		int b = 1;
		while(b<11) {
			System.out.println("while loop :"+"b"+"="+b);
			b++;
		}
		
		int c = 1;
		do {
			System.out.println(c);
			c++;
		}
		while(c<11);

	}

}
