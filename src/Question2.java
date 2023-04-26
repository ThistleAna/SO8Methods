// also to answer Q8 Exercise 1
public class Question2 {
    //Method 1 passing firstName
    static void myMethod(String firstName){
        System.out.println(firstName + " Doe");
    }

    //Method 2 passing firstName and lastName parameters
    static void myMethod(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    // Method 3 firstName, middleName,  lastName
    static void myMethod(String firstName, String middleName, String lastName){
        System.out.println(firstName + " " + middleName + " " + lastName);
    }

    //main method
    public static void main(String[] args) {
        myMethod("John");
        myMethod("Emily");
        myMethod("Brown");

        myMethod("Albus", "Dumbledore");
        myMethod("Draco", "Lucius", "Malfoy");
    }
}
//Draco Lucius Malfoy
