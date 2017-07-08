import java.util.Scanner;

public class MileToKM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter miles: ");
		double mile = scanner.nextDouble();
		scanner.close();
		System.out.println(mile + " miles is " + mile*1.6 + "KM");
	}

}
