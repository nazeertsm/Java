package JavaClasses.load;

/**
 * This is the main class that tests the functionality of MyClass.
 */
public class Maintest {
    /**
     * The main method from where the program starts execution.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Pass MyClass.class to the handleClass method
        handleClass(MyClass.class);
    }

    /**
     * This method handles the passed class, creates an instance of it and calls its methods.
     * @param clazz The class to be handled
     */
    public static void handleClass(Class<MyClass> clazz) {
        // Print the name of the received class
        System.out.println("Received class: " + clazz.getName());
        try {
            // Instantiate the class using its default constructor
            MyClass instance = clazz.getDeclaredConstructor().newInstance();
            // Print the name of the instantiated class
            System.out.println("Instantiated class: " + clazz.getName());
            // Print the name of the instance of the class
            System.out.println("Instance of class: " + instance.getClass().getName());
            // Print the name of the executed method
            System.out.println("Executed method: " + clazz.getName() + ".myMethod()");
            // Call the myMethod of the class
            instance.myMethod();
            // Call the myOtherMethod of the class
            instance.myOtherMethod();
        } catch (Exception e) {
            // Print an error message if there is an exception while handling the class
            System.err.println("Error handling class: " + clazz.getName());
            // Print the stack trace of the exception
            e.printStackTrace();
        }
    }
}

/**
 * This is a sample class with two methods for testing.
 */
class MyClass {
    /**
     * This method prints a message when called.
     */
    public void myMethod() {
        // Print a message indicating that the method is being executed
        System.out.println("Executing MyClass method.");
    }

    /**
     * This method prints a different message when called.
     */
    public void myOtherMethod() {
        // Print a message indicating that the other method is being executed
        System.out.println("Executing MyClass other method.");
    }
}