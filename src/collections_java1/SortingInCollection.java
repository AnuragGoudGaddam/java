package collections_java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingInCollection {
	
  public static void main(String[] args) {
	
	  List<String> li = new ArrayList<>();
	  li.add("Anurag");
	  li.add("Abhiraj");
	  li.add("Mahesh");
	  li.add("Pavan");
	  li.add("Gopal");
	  System.out.println(li);
	  Set<String> set=new TreeSet<>();
	  set.addAll(li);
	  System.out.println(set);
}

}
