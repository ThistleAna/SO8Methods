public class ExampleParameter {
    // my own method to pass the fname
    static void greeting(String fname){ // parameter passing
        System.out.println("Hello, welcome back " + fname);
    }

    // main method
    public static void main(String[] args) {
        greeting("Mimi"); // passing on arguments
        greeting("Bob");
    }
}
