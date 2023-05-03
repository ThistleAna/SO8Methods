// question 10, myCalculator program
import java.util.Scanner;

public class ReturnExample {
    // own method
    static int add(int x, int y){
        return x+y;
    }

    // create a new method called minus, use return key word to substract x - y
    static int minus(int x, int y){
        return x-y;
    }

    // create a new method called multiply, use return keyword to multiply x*y
    static int multiply(int x, int y){
        return x*y;
    }

    // create a new method called divide, use return keyword to divide x/y
    static int divide(int x, int y){
        return x/y;
    }

    // overload divide method so that it can compute double variables
    static double divide(double x, double y){
        return x/y;
    }

    // main method
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter number 1 and 2 and read
        System.out.println("Enter the first number  = ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number = ");
        int num2 = reader.nextInt();

        // print the result
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + minus(num1, num2));
        System.out.println(num1 + " x " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " : " + num2 + " = " + divide(num1, num2));
        System.out.println(num1 + " : " + num2 + " = " + divide((double)num1, (double) num2));

    }
}
