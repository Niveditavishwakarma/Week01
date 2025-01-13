import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=100;i>=1;i--){
		 if(i%number==0)
         System.out.println(" Multiple of "+number + " is "+ i  );
	}
        // Close the scanner
        scanner.close();
    }
}