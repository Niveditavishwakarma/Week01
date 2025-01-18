import java.util.*;
import java.lang.Math;
public class AbundantNumber{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        int temp = num;
        int sumOfDivisors = 0;
        // Calculate the sum of all the divisior
        for(int i = 1;i<= num /2 ;i++){
            if(num%i == 0){
                sumOfDivisors += i;
            }
        }
        // Checking if the number is greater than the sum of divisors of not
        if(num <  sumOfDivisors)
            System.out.println("Its a Abundant Number");
        else
            System.out.println("Its not a Abundant Number");
		//closing the scanner
		sc.close();
        }
}