import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input
		System.out.print("Enter the amount of water in kg: ");
		double water = sc.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemp = sc.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemp = sc.nextDouble();
		sc.close();
		// Output with calculation
		System.out.println("The energy needed is " + (water * (finalTemp-initialTemp) * 4184) );

	}

}
