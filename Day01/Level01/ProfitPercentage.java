//create a class ProfitPercentage to calculate profit percentage
class ProfitPercentage{
	public static void main(String a[]){
		//create a variable to store cost price 
		double costPrice = 129;
		//create a variable to store selling price 
		int sellingPrice = 191;
		// create a variable to calculate profit
		double profit = sellingPrice - costPrice;
		//calculating profit percentage
		double profitPercentage = profit/costPrice * 100;
		//Printing the profit percentage
		System.out.println("The Cost Price is INR " + costPrice + " and selling Price is INR " + sellingPrice + " \nThe Profit is INR " + profit + " and the Profit percentage is " + profitPercentage );
		
	}
	
	
	
}