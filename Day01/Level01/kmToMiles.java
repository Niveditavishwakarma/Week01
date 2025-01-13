//import Scanner class to take user input
import java.util.Scanner;
// create a KilometerToMiles class to convert kilometers into miles

//import Scanner class for taking user input
import java.util.Scanner;
class KmToMiles{
	public static void main(String a[]){
		//taking input from user
		System.out.println("Enter km: ");
		Scanner input = new Scanner(System.in);
		//create a variable that holds distance in kilometers
		double km = input.nextInt();
		//create a variable that holds distance in miles 
		double miles = 1.6 * km;
		//Print the distance in miles 
		System.out.println("The total miles is " + miles + " mile for the given " + km + "km");
	}
}

