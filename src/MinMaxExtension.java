//QS 11, PART2
//WB5 Questions11
// import scanner
import java.util.Scanner;
public class MinMaxExtension {
    // main methods
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input num1, num2, num3
        System.out.println("This program will read three numbers from you.");
        System.out.println("Enter three numbers : ");
        // instruction for the user
        // read user input as double numbers
        double val1 = reader.nextDouble();
        double val2 = reader.nextDouble();
        double val3 = reader.nextDouble();


        if (val1 % 1 == 0 && val2 % 1 == 0 && val3 % 1 == 0) { // whole numbers, int method call
            //call maxNumber do type casting from double to int
            System.out.println("The the biggest number is " + largest((int)val1,(int) val2, (int)val3));
            //call minNumber do type casting from double to int
            System.out.println("The the smallest number is " + smallest((int)val1,(int) val2, (int)val3));
        } else { // decimal numbers, double method call
            //call maxNumber
            System.out.println("The the biggest number is " + largest(val1, val2, val3));
            //call minNumber
            System.out.println("The the smallest number is " + smallest(val1, val2, val3));
        }


    }// main method ends

    // method 1 to find the biggest number int- Maha
    static int smallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    // create method 2 to return the minimum int number -Milad
    static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // create method 3 to return the max number (double) use method overloading- Aidan
    static double largest(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // create method 4 to return the min number (double) use method overloading- Samuel
    static double smallest(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
