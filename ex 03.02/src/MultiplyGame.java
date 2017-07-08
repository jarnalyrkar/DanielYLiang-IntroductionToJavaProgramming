import java.util.Random;
import java.util.Scanner;

public class MultiplyGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// Set random-range
		int min = 1;
		int max = 9;
		
		//Input: 
		int firstNumber = rand.nextInt((max - min) + 1) + min;
		int secondNumber = rand.nextInt((max - min) + 1) + min;
		int thirdNumber = rand.nextInt((max - min) + 1) + min;
		
		System.out.println("What is " + firstNumber + " x " + secondNumber + " x " + thirdNumber + "?");
		int answer = sc.nextInt();
		sc.close();
				
		//Calculation:
		int solution = (firstNumber*secondNumber)*thirdNumber;
			
		//Output: 
		if (answer == solution)
			System.out.println("You are right!");
		else System.out.println("Nope!");
	}
}