import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input
		System.out.print("Enter v0, v1 and t: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		sc.close();
		
		// Calculation
		double avarage = (v1-v0)/t;		
		
		// Output
		System.out.printf("The avarage acceleration is %.4f", avarage);
		
		
	}

}
