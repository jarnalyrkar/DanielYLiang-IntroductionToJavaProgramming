import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		double distance, miles, gasPrice, fullCost;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		distance = sc.nextDouble();
		System.out.println("Enter miles per gallon: ");
		miles = sc.nextDouble();
		System.out.println("Enter price per gallon: ");
		gasPrice = sc.nextDouble();
		sc.close();
		
		//eksempeldata: 
		//distance = 900.5;
		//miles = 25.5;
		//gasPrice = 3.55;
		
		//Calculation:
		fullCost = distance/miles*gasPrice;
		
		//Output: 
		System.out.println("The cost of driving is $" + fullCost);
	}

}
