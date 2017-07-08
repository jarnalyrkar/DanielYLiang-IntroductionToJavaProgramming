import java.util.Scanner;

public class SqMtoPings {

	public static void main(String[] args) {
		// inndata
		final double ping = 0.3025;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in square meters: ");
		int meter = sc.nextInt();
		sc.close();
		
		// utdata
		System.out.println(meter + " square meters is " + meter*ping + " pings");
		
	}

}
