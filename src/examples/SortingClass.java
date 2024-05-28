package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingClass {

	public static void main(String[] args) {
          List<Object> l1= Arrays.asList(2,9,11);
          List<Object> l2= Arrays.asList(1,8,10);
          List<Object> l3 = new LinkedList<Object>();
          l3.addAll(l2);
          l3.addAll(l1);
          System.out.println(l3);
          System.out.println(l3);
          List<Object> l5= List.of(2,9,11);
	}

}
