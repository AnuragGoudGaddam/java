package java_8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomeOfTwoIntegerMain {

	public static void main(String[] args) {

		List<Integer> arry=Arrays.asList(11,12,14,121,12,13,15,16);
		
		
		
		List<Integer> EvenNumbers=  arry.stream().filter(n->n%2==0).collect(Collectors.toList()); 
		
		System.out.println("Even Numbers"+EvenNumbers);
		

	}

}




















//SomeOfTwoInteger si= (str)-> {
//return (Boolean) str.isEmpty();
//};

//Boolean sq1=si.value("I am Anurag");
//Boolean sq2=si.value("");

//System.out.println("Filled String  :"+ sq1);
//System.out.println("Empty String  :"+ sq2);

//SomeOfTwoInteger si2 = (str) -> {
//	return str.toUpperCase();
//};
//
//String ss2= si2.value("anurag goud gaddam");
//
//System.out.println("My Name is :"+ss2);