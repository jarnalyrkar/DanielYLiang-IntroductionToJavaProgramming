import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your monthly saving amount: ");
		sc.close();
		final int SAVINGS = sc.nextInt();
		final double RATE = 0.003125;
				
		double savingsTotal = SAVINGS + (SAVINGS*RATE);
		System.out.println("First month: " + savingsTotal);
		
		savingsTotal = (SAVINGS + savingsTotal) * (1 + RATE);
		System.out.println("Second month: " + savingsTotal);
		
		savingsTotal = (SAVINGS + savingsTotal) * (1 + RATE);
		System.out.println("Third month: " + savingsTotal);
		
		savingsTotal = (SAVINGS + savingsTotal) * (1 + RATE);
		System.out.println("Fourth month: " + savingsTotal);
	
		savingsTotal = (SAVINGS + savingsTotal) * (1 + RATE);
		System.out.println("Fifth month: " + savingsTotal);
		
		savingsTotal = (SAVINGS + savingsTotal) * (1 + RATE);
		System.out.println("Sixth month: " + savingsTotal);
		
	}

}
