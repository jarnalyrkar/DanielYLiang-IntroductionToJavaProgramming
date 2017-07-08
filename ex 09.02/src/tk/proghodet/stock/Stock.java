package tk.proghodet.stock;

public class Stock {
	// Objektvariabler:
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	// Konstruktør: 
	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	// Metoder
	public double getChangePercent() {
		return (((this.getPreviousClosingPrice()/100) - (this.getCurrentPrice()/100))*100);
	}
	
	// Getters & Setters
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	

	
}
