import java.util.Scanner;

public class HexArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double hexformula = (3*(Math.sqrt(3))/2);
		double s = sc.nextDouble();
		sc.close();

		double answer = hexformula * Math.pow(s, 2);
		
		System.out.println("The area of the hexagon is: " + answer);
		
	}

}
