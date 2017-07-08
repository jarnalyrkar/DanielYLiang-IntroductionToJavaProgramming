import java.util.Scanner;

public class InvestmentValue {

	public static void main(String[] args) {
		double amount, annualInterestRate, futureInvestmentValue;
		int years;
		Scanner sc = new Scanner(System.in);
		
		//Input:
		System.out.println("Enter investment amount: ");
		amount = sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		annualInterestRate = sc.nextDouble()/100;
		System.out.println("Enter number of years: ");		
		years = sc.nextInt();
		sc.close();
		
		//eksempeldata:
		//amount = 1000.56;
		//annualInterestRate = 4.25;
		//years = 1;
		
		//Calculation:
		futureInvestmentValue = amount * (1 + Math.pow(annualInterestRate, years));
		
		//Output: 
		System.out.println("Accumulated value is: $" + futureInvestmentValue);
	}

}
