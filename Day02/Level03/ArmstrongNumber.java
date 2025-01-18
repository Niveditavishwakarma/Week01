import java.util.*;
import java.lang.Math;
public class Armstrong{
    public static void main(String[] args){
        // Created a Scanner to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        // Take the input from user
        int num = sc.nextInt();
        int temp = num;
       
        int sum = 0;
        String str = String.valueOf(num);
        int power = str.length();

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit,power);
            num /= 10;
        }
        if(temp == sum)
            System.out.println("Yes It's a Armstrong Number");
        else
            System.out.println("No It's not a Armstrong Number");
		//closing the scanner object
		sc.close();

        
    }
}