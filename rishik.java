import java.util.*;

public class rishik {
    public static void main(String[] args){
        @SuppressWarnings("resource")
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        
        // Taking inputs from the user
        System.out.print("1st number: ");
        int a = scanner.nextInt();
        System.out.print("2nd number: ");
        int b = scanner.nextInt();
        
        System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n");
        System.out.print("Enter the number corresponding to what operation you want to do: ");
        int o = scanner.nextInt();
        
        // Performing operation based on user input
        if(o == 1){
            System.out.println("Result: " + add(a, b));
        } else if (o == 2) {
            System.out.println("Result: " + subtract(a, b));
        } else if (o == 3) {
            System.out.println("Result: " + multiply(a, b));
        } else if (o == 4) {
            if(b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Result: " + divide(a, b));
            }
        } else if (o == 5) {
            System.out.println("Result: " + remainder(a, b));
        } else {
            System.out.println("Operation not in the list. :))");
        }
    }
    
    // Addition method
    private static int add(int a, int b){
        return a + b;
    }
    
    // Subtraction method
    private static int subtract(int a, int b){
        return a - b;
    }
    
    // Multiplication method
    private static int multiply(int a, int b){
        return a * b;
    }
    
    // Division method (returns double for floating point results)
    private static double divide(int a, int b){
        return (double) a / b; // Use double for floating-point division
    }
    
    // Remainder method
    private static int remainder(int a, int b){
        return a % b;
    }
}