package org.exercises;


//import org.exercises.dataStore.SimpleDB;

public class SimpleCalculator {
    // Predefined numbers and operations
//    static double num1 = SimpleDB.getNum1(); // First number
//     static double num2 = SimpleDB.getNum2(); // Second number
    static double num1 = 10; // First number
    static double num2 = 5; // Second number

    public static void execute() {

        // Perform operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        // Display results
        System.out.println("Simple Calculator Results:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}
