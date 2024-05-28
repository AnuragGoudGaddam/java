package examples;

import java.util.Scanner;

public class BankAccount {

	private static int accountNumber;
	private static double ammount;
	private static double balance;
	private static int button;

	public static void deposit(double ammount) {
		balance = balance + ammount;

		System.out.println("Amount is added to your account :" + balance);
	}

	public static void WithDraw(double ammount) {
		if (balance < ammount) {
			System.out.println("Insufficent Balance :" + balance);
		} else {
			balance = balance - ammount;
			System.out.println("Amount is withdrawed from your account :" + balance);
		}
	}
	public static void balance (double balance) {
		System.out.println("Your account balance is :"+ balance);
	}
	
	

	public static void main(String[] args) {
		balance = 1000;
		Scanner sc = new Scanner(System.in);

		boolean continueTraction = true;
		while (continueTraction) {
			System.out.println("Please Enter 1 for Deposit");
			System.out.println("Please Enter 2 for Withdraw");
			System.out.println("please Enter 3 for check Balance");

			int transactionId = sc.nextInt();

			switch (transactionId) {
			case 1: {
				System.out.println("Please enter Amount");
				ammount = sc.nextDouble();
				deposit(ammount);
				break;
			}
			case 2: {
				System.out.println("Please enter the ammount");
				ammount = sc.nextDouble();
				WithDraw(ammount);
				break;
			}
			case 3: {
				balance(balance);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + transactionId);
			}
			
			System.out.println("If you want to continue the Transaction please enter 1 or else 0" );
			int tarnsaction = sc.nextInt();
			if (tarnsaction != 1) {
				continueTraction = false;
			}
			
		}

		sc.close();


	}

}
