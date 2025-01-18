import java.util.Scanner;
//create a class for computing the largest number
class LargestNumber{
	public static void main(String args[])
	{
		//creating an object of scanner class
		Scanner input = new Scanner(System.in);

        // Get input values for the three numbers
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if each number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        // Print the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner
        input.close();
	}
}