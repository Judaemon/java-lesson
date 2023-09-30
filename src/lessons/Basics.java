package lessons;
// In this code:

// We declare variables using different data types.
// We assign values to these variables.
// We use the System.out.println() method to display the values of these variables.

public class Basics {
    public static void main(String[] args) {
        // Primitive Data Types
        int myAge = 25;
        float pi = 3.14f;
        double price = 19.99;
        char grade = 'A';
        boolean isJavaFun = true;

        // Reference Data Types
        String greeting = "Hello, World!";
        int[] numbers = {1, 2, 3, 4, 5};

        // Output
        System.out.println("My age: " + myAge);
        System.out.println("The value of pi: " + pi);
        System.out.println("Price: $" + price);
        System.out.println("My grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);

        System.out.println("Greeting: " + greeting);
        System.out.print("Numbers: ");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // -------------------------------------------------------------

        int sum = 5 + 3; // sum is now 8
        int difference = 10 - 4; // difference is now 6
        int product = 6 * 7; // product is now 42
        double quotient = 15.0 / 3.0; // quotient is now 5.0
        int remainder = 17 % 4; // remainder is now 1

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);

        double squareRoot = Math.sqrt(25.0); // squareRoot is now 5.0
        double result = Math.pow(2.0, 3.0); // result is now 8.0 (2^3)
        double randomValue = Math.random(); // randomValue is between 0.0 (inclusive) and 1.0 (exclusive)

        System.out.println("squareRoot : " + squareRoot);
        System.out.println("result : " + result);
        System.out.println("randomValue : " + randomValue);
    }
}
