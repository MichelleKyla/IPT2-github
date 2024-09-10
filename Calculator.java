import java.util.Scanner;


public class Calculator {
   
    public static int addition(int a, int b) { return a + b; }
    public static int subtraction(int a, int b) { return a - b; }
    public static int multiplication(int a, int b) { return a * b; }
    public static double division(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return (double) a / b;
    }
    public static int modulus(int a, int b) { return a % b; }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Simple Calculator\n");
        System.out.println("Choose operation: +, -, *, /, %");


        char operation = scanner.next().charAt(0);
        System.out.println("");


        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        System.out.println("----------------------");

        try {
            switch (operation) {
                case '+': System.out.println("Result: " + addition(num1, num2)); break;
                case '-': System.out.println("Result: " + subtraction(num1, num2)); break;
                case '*': System.out.println("Result: " + multiplication(num1, num2)); break;
                case '/': System.out.println("Result: " + division(num1, num2)); break;
                case '%': System.out.println("Result: " + modulus(num1, num2)); break;
                default: System.out.println("Invalid operation.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        scanner.close();
    }
}
