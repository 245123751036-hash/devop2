

public class hello {
    public static void main(String[] args) {
        int number = 5; // The number to calculate the factorial of
        long factorial = 1; // Use 'long' to handle larger results and avoid overflow

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the running total by the current number
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}




