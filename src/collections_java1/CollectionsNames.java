package collections_java1;

import java.nio.file.DirectoryStream.Filter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsNames {

	public static void main(String[] args) {
		List<String> anu = new LinkedList<String>();
		anu.add("Anurag");
		anu.add("Shyam");
		anu.add("Lokesh");
		anu.add("Purna");
		anu.add("Ajay");
		anu.add("Pavan");
		
        List<String> filterString = anu.stream().filter(s->s.toLowerCase().startsWith("a")).collect(Collectors.toList());
        filterString.forEach(System.out::println);
        
	}

}
