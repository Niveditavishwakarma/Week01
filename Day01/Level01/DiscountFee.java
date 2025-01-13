//import Scanner class to take user input
import java.util.Scanner;
//create a class for computing the discount and paying amount
class DiscountFee{
	public static void main(String args[]){
		//take input from user 
		Scanner input = new Scanner(System.in);
		//create a variable to store fee
		int fee = input.nextInt();
		//create a variable to store discount percent
		int discountPercent = input.nextInt();
		//calculate the discount 
		double discount = fee * discountPercent/100;
		//create a variable to store the paying fee
		double finalFee = fee - discount;
		//Printing the discount and the final fee
		System.out.println("The discount amount is INR " +  discount + " and final discounted fee is INR " + finalFee);
	}
}