package collections_java1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Vector_Collection {

	public static void main(String[] args) {
		Vector<String> vect = new Vector<>();

		vect.add("string");
		vect.add("stact");
		vect.add("fox");

		System.out.println(vect);

		Scanner sc = new Scanner(System.in);
		List<Object> l1 = new ArrayList<>();
		System.out.println("Add the list ");
		l1.add(sc.next());
		System.out.println("Add the Int ");
		l1.add(sc.nextInt());
		System.out.println("Add the string ");
		l1.add(sc.next());
		System.out.println("Add the Int ");
		l1.add(sc.nextInt());
		System.out.println(l1);

		Set<Object> s1 = new HashSet<>();
		s1.addAll(l1);
		System.out.println(s1);

	}

}
