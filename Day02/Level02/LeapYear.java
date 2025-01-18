import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input from user
        System.out.print("Enter a year (greater than 1582): ");
        int year = sc.nextInt();

        //according to gregorian calender
        if (year <= 1582) {
            System.out.println("Please enter a year greater than 1582.");
        } 
		else {
            
			if(year %100==0){
			if(year%400==0)
                System.out.println(year + " is a leap year.");
             else {
                System.out.println(year + " is not a leap year.");
				}
			}
			else{
				if(year%4==0) 
                System.out.println(year + " is a leap year.");
				else
                System.out.println(year + " is not a leap year.");
				}
			}
        sc.close();
    }
}