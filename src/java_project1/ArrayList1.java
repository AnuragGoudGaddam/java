package java_project1;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(23);
		list.add(66);
		System.out.println(list);

		list.add(44);

		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("list Size :" + list.size());

		// methods in collections
		//  add
		//   size
		//	remove
		//	iterate
		//	addAll
		//	removeAll
		//	clear

	}

}
