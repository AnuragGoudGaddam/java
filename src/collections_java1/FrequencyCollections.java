package collections_java1;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCollections {
	public static void main(String[] args) {
		int [] a = {1,1,3,2,2,3,3,3,5,8,12,13,2,5};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		for(Map.Entry   a1 : map.entrySet())
		{
		System.out.println(a1.getKey() + " = "+a1.getValue());
		}
		
	}

}
