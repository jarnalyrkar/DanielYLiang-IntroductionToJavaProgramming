import java.util.Scanner;

public class GMT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = sc.nextInt();
		sc.close();
		// Calculation
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		// Output
		System.out.println("Current time is " + ((currentHour)+(offset)) + ":" + currentMinute + ":" + currentSecond + " GMT");
		
	}

}
