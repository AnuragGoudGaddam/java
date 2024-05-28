package java_project1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets_HashSet {

	public static void main(String[] args) {
		
      List<Integer> num = new ArrayList<>();
      num.add(1);
      num.add(3); 
      num.add(5);
      num.add(7);
      num.add(11);
      num.add(13);
      num.add(1);
      num.add(13);
      num.add(5);
      num.add(8);
      num.add(4);
      num.add(2);
      System.out.println(num);
      Set<Integer> uniqueNum = new HashSet<>(num) ;
      System.out.println(uniqueNum);
      for(int numn :uniqueNum) {
    	  System.out.println(numn);
      }
      
      
	}

}
