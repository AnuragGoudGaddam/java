package examples;
import java.util.Scanner;    

public class Emi_Calculations {

	public static double calculation(double principal, double intrest, int tensureYears) {
		
		double monthlyIntrestRate=intrest/(12*100);
		int tensure = tensureYears*12;
		double emi = (principal*monthlyIntrestRate*Math.pow(1+monthlyIntrestRate, tensure))/
				(Math.pow(1+monthlyIntrestRate, tensure)-1);
			
		return emi;
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal amount ");
  
		double principal = sc.nextDouble();

		System.out.println("Enter intrest amount ");

		double intrest = sc.nextDouble();

		System.out.println("Enter tensure   years  ");

		int tensureYears = sc.nextInt();

		double emi = calculation(principal, intrest, tensureYears);

		System.out.println("Emi :" + emi);
		

	}

}
