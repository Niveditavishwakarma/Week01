import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

		for(int i=1;i<=number;i++){
		    if(number%i==0)
		System.out.println(" Factor of "+number + " is "+ i );

}
        // Close the scanner
        scanner.close();
    }
}