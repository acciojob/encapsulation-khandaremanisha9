// Task 3: Create main function and use RWOnly class
public class Main {
    public static void main(String[] args) {
        // Create an object of RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Try directly accessing the private variable `name`
        // obj.name = "John"; // This will cause a compile-time error
        // System.out.println(obj.name); // Error: name has private access in RWOnly

        // Task 6: Use setter to set value and getter to access the value
        obj.setName("John");
        System.out.println("The name is: " + obj.getName());

        // Learnings:
        // Encapsulation ensures that sensitive data is hidden from direct access.
        // Data can only be modified or accessed via methods (getters/setters).
    }
}
