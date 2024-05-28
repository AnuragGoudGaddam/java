package java_project1;

public class StringBulderS_Java {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("Anurag");
		System.out.println(sb);
		
//		System.out.println(sb.charAt(0));
//		sb.setCharAt(0 , 'B');
//		System.out.println(sb);
		
		sb.insert(4, 'a');
		
		System.out.println(sb);

		sb.delete(4, 5);
		
		System.out.println(sb);
		
		sb.append('g');
		
		System.out.println(sb);
	}

}
