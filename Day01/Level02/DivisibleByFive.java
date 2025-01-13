// Create DivisibleBy5 Class to compute the whether a number is divisible or not
import java.util.Scanner;

class DivisibleByFive{


   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for number
	  System.out.println("Enter a number: ");
      int origNumber = input.nextInt();
	  
	  
     //Check if origNumber is divisible by 5
	 if(origNumber%5 == 0)
	 { 	
		System.out.println( " Is the number " + origNumber + " divisible by 5? " + "true");

	 }
	 else{
		System.out.println( " Is the number " + origNumber + " divisible by 5? " + "false");
	 }
	 //Closing the Scanner object
      input.close();
   }
}


