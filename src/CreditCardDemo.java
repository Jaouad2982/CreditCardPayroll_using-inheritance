import java.util.Scanner;

public class CreditCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		CreditCard currentCard = new CreditCard();
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		
		currentCard.setName(name);
		
		int option;
		do {
			System.out.println("Press 1 to charge something to your card");
			System.out.println("Press 2 to pay your credit card");
			System.out.println("Press 3 to look at balance of your card");
			System.out.println("Press 4 to look at the credit limit");
			System.out.println("Press 5 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				//System.out.println("Enter the price of the item");
				double price = getAmount();
				boolean approved = currentCard.charge(price);
				if(approved == true) {
					System.out.println("Your charge was approved");
				}
				else {
					System.out.println("Your charge was not approved");
				}
			}
			else if(option == 2) {
				//System.out.println("Enter the amount you want to pay");
				double amount = getAmount();
				boolean wentThrough = currentCard.pay(amount);
				if(wentThrough == true) {
					System.out.println("Your payment went through");
				}
				else {
					System.out.println("Your payment did not go through");
				}
			}
			else if (option == 3) {
				System.out.println("Your balance is: " + currentCard.getBalance());
			}
			else if(option == 4) {
				System.out.println("The credit limit is: " 
									+ CreditCard.getCreditLimit());
			}
			else if(option == 5) {
				System.out.println("Thank you for using our program");
			}
			else {
				System.out.println("Error! Invalid option! Try again");
			}
			
		}while(option != 5);
		
	}
	
	public static double getAmount() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount = keyboard.nextDouble();
		return amount;
	}
	
	
	
	
	
	

}