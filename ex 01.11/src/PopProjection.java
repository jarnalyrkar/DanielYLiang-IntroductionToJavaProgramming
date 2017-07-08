public class PopProjection {

	private static final int ONE_BIRTH = 7;
	private static final int ONE_DEATH = 13;
	private static final int ONE_IMMIGRANT = 45;
	private static final int YEARS = 5;
	private static final int YEAR_DAYS = 365;
	private static final int DAY_HOURS = 24;
	private static final int SECONDS_AND_MINUTES = 60;
	private static final int CURRENT_POP = 312032486;
	
	private static final int SECONDS_IN_YEAR = (SECONDS_AND_MINUTES * SECONDS_AND_MINUTES * DAY_HOURS * YEAR_DAYS);
	
	public static void main(String[] args) {
		System.out.println("Current population: " + CURRENT_POP);
		
		// Newborns: 
		int newborns = (SECONDS_IN_YEAR / ONE_BIRTH) * YEARS;
		System.out.println("Newborns in 5 years: " + newborns);
		
		// Deaths: 
		int deaths = (SECONDS_IN_YEAR / ONE_DEATH) * YEARS;
		System.out.println("Deaths in 5 years: " + deaths);
		
		//Immigrants
		int immigrants = (SECONDS_IN_YEAR / ONE_IMMIGRANT) * YEARS;
		System.out.println("Immigrants in 5 years: " + immigrants);
		
		int newPop = (CURRENT_POP + (newborns + immigrants)) - deaths;
		System.out.println("New population: " + newPop);
		
	}

}
