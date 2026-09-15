import java.util.Scanner;

public class IT26102354Lab7Q3 {
	public static void main(String[] args){
		
		final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMER = 5;
		
		double billAmount,amountToPay;
		char paymentMode;
		
		double discount =0;
		
	Scanner input = new Scanner(System.in);
		
		for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMER;customerCount++){
			System.out.println("Customer" + customerCount);
			
			System.out.print("Enter the bill amount: ");
			billAmount = input.nextDouble();
			
			System.out.print("Enter mode of payment (c for cash,o for other):");
			paymentMode = input.next().charAt(0);
			
			if (paymentMode == 'C'|| paymentMode == 'c'){
				discount = billAmount * DISCOUNT_RATE;
			    amountToPay = billAmount - discount;
				 
				System.out.println("Discount is : "+ discount);
				System.out.println("Amount to be paid: "+ amountToPay);
			}
			else if (paymentMode == 'O' || paymentMode == 'o'){
				System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
			}
			else{
				System.out.println("Payment Mode is Not Valid");
			}
			System.out.println();
		}
	}
}