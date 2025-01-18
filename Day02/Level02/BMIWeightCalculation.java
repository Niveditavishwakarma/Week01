import java.util.Scanner;

public class BMIWeightCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        
        double heightInM = heightInCm / 100;
        double bmi = weight / (heightInM * heightInM);
        
        System.out.println("Your BMI is:" + bmi);

        if (bmi < 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25.0 && bmi < 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}