package java_8features;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Functional_Lamda {
	public static void main(String[] args) {

//		MyInter i = new MyInter() {
//
//			@Override
//			public void sayHello() {
//				System.out.println("I am anurag");
//			}
//
//		};
//
//		i.sayHello();

		MyInter i = () -> System.out.println("I Am Using Lamda for the first time ");

		i.sayHello();

		CallingString i1 = (str) -> str.length();

		System.out.println(i1.getLength("Anurag"));

		System.out.println(i1.getLength("Purna  "));

		Validing_thr_Lambda vl = (username, password) -> {
			return username.equalsIgnoreCase("anurag") && password.equals("Anurag@123") ? "Login Sucessfull"
					: "LoginFailed";
		};
		Validing_thr_Lambda v2 = (username,
				password) -> username.equalsIgnoreCase("Abhiraj") && password.equals("Abhiraj@121") ? "Login Sucessfull"
						: "Login Failed";
		String m1 = v2.vslid("Abhiraj", "Abhiraj@121");
		System.out.println("Login With out return " + m1);
 
		String s1 = vl.vslid("Anurag", "Anurag@123");
		System.out.println("Login 1 :" + s1);

		String s2 = vl.vslid("Anurag123", "Anurag@123");
		System.out.println("Login 1 :" + s2);

		String s3 = v2.vslid("Ashok", "Ashok9550");
		System.out.println("Login With out return " + s3);

		List<String> items = Arrays.asList("Anurag", "Abhiraj", "Abhimanyu");
		items.forEach(item -> System.out.println(item));
		
		

	}
}