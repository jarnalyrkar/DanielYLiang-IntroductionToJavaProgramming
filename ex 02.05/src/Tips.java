import java.util.Scanner;
public class Tips {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// inndata
		System.out.print("Enter the subtotal and gratuity rate: ");
		int subtotal = sc.nextInt();
		int gratuity = sc.nextInt();
		sc.close();
		
		// beregning
		double tip = ((subtotal/100.0/10)*gratuity*10);
		double total = subtotal+tip;
		
		// utdata
		System.out.println("The gratuity is $" + tip + " and total is $" + total);

	}

}
