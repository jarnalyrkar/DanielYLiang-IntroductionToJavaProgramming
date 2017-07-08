import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		//Input:
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		double wind = sc.nextDouble();
		sc.close();
		
		//Calculation:
		double windChill = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(wind, 0.16)))
						+ (0.4275 * temp * Math.pow(wind, 0.16));
		
		//Output:
		System.out.println("The wind chill index is: " + windChill);
		
	}
}