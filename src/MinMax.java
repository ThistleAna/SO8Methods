// Question 11
// import scanner
import java.util.Scanner;
public class MinMax {
    // main method
    public static void main(String[] args) {
        // create object scanner
        Scanner reader = new Scanner (System.in);
        // ask user to enter 3 number (num1, num2, num3)
        System.out.println("Enter three numbers: ");
        // read user input
        int val1 = reader.nextInt();
        int val2 = reader.nextInt();
        int val3 = reader.nextInt();
        // print them
        System.out.println("You have entered " + val1 + " " + val2 + " " + val3);

        // call the method smallest to print the smallest number
        System.out.println("The smallest number is " + smallest(val1, val2, val3));
        // call the method to print the biggest number
        System.out.println("The biggest number is " + biggest(val1, val2, val3));
    } //main method ends

    // new method to find the smallest number
    static int smallest(int a, int b, int c){
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }


    // create new method to find the biggest number
    static int biggest(int a, int b, int c){
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }


}
