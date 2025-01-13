//create a class for computing the discount and paying amount
class Discount{
	public static void main(String args[]){
		//create a variable to store fee
		int fee = 125000;
		//create a variable to store discount percent
		int discountPercent = 10;
		//calculate the discount 
		double discount = fee * discountPercent/100;
		//create a variable to store the paying fee
		double finalFee = fee - discount;
		//Printing the discount and the final fee
		System.out.println("The discount amount is INR " +  discount + " and final discounted fee is INR " + finalFee);
	}
}