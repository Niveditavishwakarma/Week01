//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating the total price of an item
class TotalPriceCalculator {
    public static void main(String args[]) {
        //take input from user 
        Scanner input = new Scanner(System.in);
        
        //create variables to store unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
        
        //calculate the total price
        double totalPrice = unitPrice * quantity;
        
        //print the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
