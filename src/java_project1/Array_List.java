package java_project1;

import java.util.ArrayList;

// ArrayList implements List interface ,ArrayList is a dynamic resizing Array in Java 
// It is good for  random access but slower for insert/delete in middle 

public class Array_List {

	public static void main(String[] args) {
		  
		ArrayList<String> studentName= new ArrayList<String>();
		studentName.add("Anurag");
		studentName.add("abhiraj");
		
		System.out.print(studentName);
		
	}

}
