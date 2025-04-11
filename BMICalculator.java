import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Get weight
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        // Get height in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        double heightInMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.printf("\nYour BMI is: %.2f\n", bmi);

        // WHO BMI Classification
        System.out.print("Category: ");
        if (bmi < 16) {
            System.out.println("Severely Underweight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal (Healthy Weight)");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi < 35) {
            System.out.println("Obese Class I (Moderate)");
        } else if (bmi < 40) {
            System.out.println("Obese Class II (Severe)");
        } else {
            System.out.println("Obese Class III (Very Severe)");
        }

        // Note for minors
        if (age < 18) {
            System.out.println("Note: For individuals under 18, BMI interpretation varies by age and gender.");
        }

        sc.close();
    }
}
