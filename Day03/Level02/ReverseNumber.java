import java.util.Scanner;
class ReverseNumber{
	public static void main(String args[]){
		//to take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		int temp = number;
		//to count the length of number
		int digitsCount = 0;
		
		while(temp > 0)
		{    
			digitsCount++;
			temp /= 10;
		}
		
		//create an array to store the digits 
		int[] digit = new int[digitsCount];
		int index = digitsCount - 1;
		while(number != 0){
			int rem = number%10;
			//assigning the values in digit array
			digit[index--] = rem;
			number/=10;
		}
		//printing the reverse array
		for(int i=digit.length-1;i>=0; i--)
		{
			System.out.print(digit[i]);
		}
		//closing the scanner
		sc.nextInt();
		
}
}