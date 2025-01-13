import java.util.Scanner;

public class ChocolateDistribution{
public static int[] findRemainderAndQuotient(int number, int divisor) {
 return new int[] {number/divisor,number%divisor};

}
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // tells user to enter number of chocolates
        System.out.print("Enter number of chocolates : ");
        int numberOfchocolates = input.nextInt();
		// tells user to enter number of Children
        System.out.print("Enter number of Children : ");
        int numberOfChildren = input.nextInt();
        // Print the result
		int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren) ;
       System.out.println("The number of chocolates  each child gets are " + result[0]+ " \n The number of remaining Chocolates are "+ result[1] );
        // Close the input
        input.close();
    }
}


