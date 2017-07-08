import java.util.Scanner;

public class InterestCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance, annualInterestRate, interest;
		
		//Input:
		System.out.println("Enter balance and interest rate: ");
		balance = sc.nextDouble();
		annualInterestRate = sc.nextDouble();
		sc.close();
				
		//Eksempeldata
		//balance = 1000; annualInterestRate = 3.5;
		
		//Calculation: 
		interest = balance*(annualInterestRate/1200);
		
		//Output: 
		System.out.println(interest);
		
		
	}

}
