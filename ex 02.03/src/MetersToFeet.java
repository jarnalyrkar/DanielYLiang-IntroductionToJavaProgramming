import java.util.Scanner;

public class MetersToFeet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// inndata
		System.out.print("Enter a value for meter: ");
		int meter = sc.nextInt();
		sc.close();
		
		// beregning
		double feet = meter * 3.2786;
		
		// utdata
		System.out.print(meter + " meters is " + feet + " feet");
	}
}
