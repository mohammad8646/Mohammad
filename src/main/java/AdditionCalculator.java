import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Addition Calculator!");
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double result = number1 + number2;

        System.out.println("The result of adding " + number1 + " and " + number2 + " is: " + result);
        
        scanner.close();
    }
}
