package tk.proghodet.account;

public class Boot {

	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000, 4.5, "10.09.2016");
		
		
		System.out.println(a1.toString());
		
		a1.withdraw(2500);
		a1.deposit(3000);
		
		
	}

}
