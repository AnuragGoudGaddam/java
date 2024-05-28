package collections_java1;

import java.util.HashMap;
import java.util.Map;

public class Map_Collections {

	public static void main(String[] args) {
		
		Map<Object, String> name = new HashMap<Object, String>();
		name.put("Anurag", "First Name");
		name.put(99,"Second Name");
			
			System.out.println(name.containsKey("Anurag"));
			System.out.println(name.get("Anurag"));
			System.out.println(name);
		
	}

}
