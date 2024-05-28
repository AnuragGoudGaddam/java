
package collections_java1;

import java.util.ArrayList;
import java.util.List;

// ArrayList implements List interface ,ArrayList is a dynamic resizing Array in Java 
// It is good for  random access but slower for insert/delete in middle 

public class  ArrayList_In_Java  {

	public static void main(String[] args) {
		  
		ArrayList<String> studentName= new ArrayList<String>();
		List<String> ar = new ArrayList();
		studentName.add("Anurag");
		studentName.add("abhiraj");
		
		System.out.print(studentName);
		
	}

}
