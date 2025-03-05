// Defining an interface I1
interface I1 {
    void show(); // Abstract method declaration
}

// Implementing the interface in class ImplementingClass
class ImplementingClass implements I1 {
    // Overriding the show() method
    public void show() {
        System.out.println("Interface method implemented in ImplementingClass");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        I1 obj = new ImplementingClass(); // Creating an object of ImplementingClass using interface reference
        obj.show(); // Calling the implemented method
    }
}
