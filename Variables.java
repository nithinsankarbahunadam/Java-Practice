public class Variables {
    public static void main(String[] args) {
        byte myByte = 100; // Byte variable
        int myNumber = 10; // Integer variable
        double myDouble = 5.5; // Double variable
        float myFloat = 3.14f; // Float variable
        String myString = "Hello, World!"; // String variable
        boolean myBoolean = true; // Boolean variable
        
        //non-primitive data types
        String anotherString = "Java Programming";


        short myShort = 30000; // Short variable
        int myShortAsInt = myShort; // Implicit casting from short to int

        int myInt = 50000; // Integer variable
        short myIntAsShort = (short) myInt; // Explicit casting from int to

        System.out.println("Byte: " + myByte);
        System.out.println("Integer: " + myNumber);
        System.out.println("Double: " + myDouble);
        System.out.println("Float: " + myFloat);
        System.out.println("String: " + myString);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Another String: " + anotherString);
        System.out.println("Short: " + myShort);
        System.out.println("Short as Int (with upcasting): " + myShortAsInt);
        System.out.println("Int: " + myInt);
        System.out.println("Int as Short (with downcasting): " + myIntAsShort);

        exampleMethod();
    }

    public static void exampleMethod() {
        int localVariable = 42; // Local variable
        System.out.println("Local Variable: " + localVariable);
    }
}