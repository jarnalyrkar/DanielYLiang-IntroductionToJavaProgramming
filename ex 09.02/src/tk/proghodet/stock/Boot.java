package tk.proghodet.stock;

public class Boot {

	public static void main(String[] args) {
		Stock s1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		
		System.out.println("Previous closing price: " + s1.getPreviousClosingPrice());
		System.out.println("Current price: " + s1.getCurrentPrice());
		System.out.println("Difference in percent: " + (double)Math.round(s1.getChangePercent()*100)/100 + "%");
	}

}
