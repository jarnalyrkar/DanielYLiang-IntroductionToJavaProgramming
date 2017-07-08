import java.util.Scanner;
public class MinutesYears {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// input
		int minutes = sc.nextInt();
		final int YEARMIN = 525600;
		final int DAYMIN = 1440;
		sc.close();
		
		// calculation
		int years = minutes / YEARMIN;
		int days = (minutes % YEARMIN)/DAYMIN;
		
		// output
		System.out.println(minutes + " minutes is approximately " + years + 
							" years and " + days + " days");
		
	}

}
