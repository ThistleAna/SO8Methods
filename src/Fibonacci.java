import java.math.BigInteger;

public class Fibonacci {
    // main method
    public static void main (String[] args){
        fibonacci(100); // print the first 10 in the sequence, must stop at 55
    }

    // own method
    public static void fibonacci(int counter) {
        // declare variable num1=0 and num2 = 1
        BigInteger num1= BigInteger.ZERO;
        BigInteger num2= BigInteger.ONE;
        // print num1 and num2 each in a new line
        System.out.println(num1);
        System.out.println(num2);
        // declare variable nextNum
        BigInteger nextNum;
        // 0-1-1-2 - we have to use loop
        for (int i=1; i < counter; i++ ){
            // calculate nextNum = num1 + num2
            nextNum = num1.add(num2);
            // print the nextNum
            System.out.println(nextNum);
            // moving to the next sequence by updating num1 and num2
            // num1 is now num2
            num1 = num2;
            // num2 is now nextNum
            num2 = nextNum;
            // end of loop
        }
    }
}
