//import Scanner class to take user input
import java.util.Scanner;
//create a class for calculating total income
class TotalIncome {
    public static void main(String args[]) {
        //take input from user
        Scanner input = new Scanner(System.in);
        
        //create a variable to store the salary
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        //create a variable to store the bonus
        System.out.print("Enter your bonus: ");
        double bonus = input.nextDouble();
        
        //calculate total income
        double totalIncome = salary + bonus;
        
        //print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
