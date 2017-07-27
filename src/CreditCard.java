
public class CreditCard {
	//instance variables are properties that are different for every object
	private String name;
	private double balance;
	
	//static variables are properties that are the same for every object
	private static double creditLimit = 5000.00;
	
	//static methods can only access static variables 
	public static void setCreditLimit(double newCreditLimit) {
		if(newCreditLimit > 0) {
			creditLimit = newCreditLimit;
		}
	}
	
	public static double getCreditLimit() {
		return creditLimit;
	}
	
	
	//default constructor
	public CreditCard() {
		name = "";
		balance = 0.0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean charge(double priceOfItem) {
		boolean chargeIsValid = false;
		if(priceOfItem >= 0) {
			double newBalance = balance + priceOfItem;
			if(newBalance <= creditLimit) {
				balance = newBalance;
				chargeIsValid = true;
			}
		}
		
		return chargeIsValid;
	}
	
	public boolean pay(double payment) {
		boolean paymentIsValid = false;
		if(payment >= 0 && payment <= balance) {
			balance = balance - payment;
			paymentIsValid = true;
		}
		
		return paymentIsValid;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
}