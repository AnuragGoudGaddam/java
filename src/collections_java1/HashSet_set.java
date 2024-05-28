package collections_java1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_set {

	public static void main(String[] args) {
         Set<String> hash= new HashSet<String>();
         hash.add("anoj");
         hash.add("kalam");
         hash.add("linked");
         hash.add("kalaaam");
         
         System.out.println(hash);
         
         TreeSet<String> tree= new TreeSet<String>(); 
         tree.addAll(hash);
         tree.add("july");
         tree.add("bad");
         System.out.println(tree);
         
         LinkedHashSet<String> lHash = new LinkedHashSet<String>();
         lHash.add("Ajjaba");
         lHash.add("Ajjaba1");
         lHash.add("Bjjaba3");
         
         
//         Array_List<String> a = new Array_List<String>();
         
         System.out.println(lHash+"linkedHashSet");
         
	}

}
