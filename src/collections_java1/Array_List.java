package collections_java1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Array_List {

	public static void main(String[] args) {
		 
		int[] a= {10,20,40,24};
		
//		System.out.println(a);
		for(int i=0 ; i<=a.length;i++) {
//			System.out.println(i);
			List<Integer> arry=new LinkedList<>();
			arry.add(a[i]);
//			System.out.println(arry);
			Set<Integer> set1= new HashSet<>();
			set1.addAll(arry);
			return;
		}
		
		
//		System.out.println(set1);  

	}

}
