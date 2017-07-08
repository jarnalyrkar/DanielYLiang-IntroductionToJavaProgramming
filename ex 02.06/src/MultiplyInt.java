import java.util.Scanner;
public class MultiplyInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// inndata
		System.out.print("Enter an integer between 1 and 999: ");
		int theNumber = sc.nextInt();
		sc.close();
	
		// beregning
		int nr1 = theNumber%10;
		int nr2 = theNumber%100/10;
		int nr3 = theNumber/100;
		
		// utdata
		System.out.print("The multiplication of all digits in " + 
						theNumber + " is " + (nr3*nr2*nr1));
	}
}
