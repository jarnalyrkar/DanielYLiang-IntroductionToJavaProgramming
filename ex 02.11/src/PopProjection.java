import java.util.Scanner;

public class PopProjection {
	
	private static final int ONE_BIRTH = 7;
	private static final int ONE_DEATH = 13;
	private static final int ONE_IMMIGRANT = 45;
	private static final int YEAR_DAYS = 365;
	private static final int DAY_HOURS = 24;
	private static final int SECONDS_AND_MINUTES = 60;
	private static final int CURRENT_POP = 312032486;
		
	private static final int SECONDS_IN_YEAR = (SECONDS_AND_MINUTES * SECONDS_AND_MINUTES * DAY_HOURS * YEAR_DAYS);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please enter amount of years: ");
		int years = sc.nextInt();
		sc.close();
		
		//System.out.println("Current population: " + CURRENT_POP);
		
		// Newborns: 
		int newborns = (SECONDS_IN_YEAR / ONE_BIRTH) * years;
		//System.out.println("Newborns in 5 years: " + newborns);
		
		// Deaths: 
		int deaths = (SECONDS_IN_YEAR / ONE_DEATH) * years;
		//System.out.println("Deaths in 5 years: " + deaths);
		
		//Immigrants
		int immigrants = (SECONDS_IN_YEAR / ONE_IMMIGRANT) * years;
		//System.out.println("Immigrants in 5 years: " + immigrants);
		
		int newPop = (CURRENT_POP + (newborns + immigrants)) - deaths;
		System.out.println("Population in " + years + " years: " + newPop);
		
	}

}
