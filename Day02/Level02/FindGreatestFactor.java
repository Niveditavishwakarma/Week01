import java.util.Scanner;

public class FindGreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = scanner.nextInt();

       for(int i=number-1;i>=1;i--)
		{
			if(number%i==0){
			System.out.print("Greatest Factor : " + i);
			break;
			}
		}
    }
}