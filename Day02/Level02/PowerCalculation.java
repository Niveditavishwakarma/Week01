import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = scanner.nextInt();
		System.out.print("Enter power :");
        int power = scanner.nextInt();
		int result=number;
		for(int i=1;i<power;i++)
			result*= number;
		System.out.print("result is  : " + result);
	}
}