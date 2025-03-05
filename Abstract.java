//// Abstract class with an abstract method
//abstract class Base {
//    abstract void info();
//}
//
//// Derived class extending the abstract class
//class Derived extends Base {
//    void info() {
//        System.out.println("Derived class method");
//    }
//}
//
//// Main class
//public class Abstract {
//    public static void main(String[] args) {
//        Base obj = new Derived(); // Creating object of Derived using Base reference
//        obj.info(); // Calling the method
//    }
//}













//
//// Abstract base class
//abstract class Base {
//    // Constructor for Base class
//    Base() {
//        System.out.println("Base constructor");
//    }
//
//    // Abstract method (must be implemented in derived class)
//    abstract void info();
//}
//
//// Derived class extending Base
//class Derived extends Base {
//    // Constructor for Derived class
//    Derived() {
//        System.out.println("Derived constructor");
//    }
//
//    // Implementing the abstract method
//    void info() {
//        System.out.println("Info method in Derived class");
//    }
//}
//
// Main class
//public class Abstract {
//    public static void main(String[] args) {
//        // Creating an object of Derived class
//        Derived obj = new Derived();
//        obj.info();
//    }
//}






//✔ Yes! You can define and call static methods inside an abstract class



//
//
//
//abstract class Base {
//    // Static method in abstract class
//    static void display() {
//        System.out.println("Static method in abstract class");
//    }
//
//    // Abstract method (must be implemented by subclass)
//    abstract void info();
//}
//
//class Derived extends Base {
//    // Implementing the abstract method
//    void info() {
//        System.out.println("Info method in Derived class");
//    }
//}
//
//public class Abstract {
//    public static void main(String[] args) {
//        // Calling static method using class name
//        Base.display();
//
//        // Creating an object of Derived and calling info()
//        Derived obj = new Derived();
//        obj.info();
//    }
//}










// Abstract base class
abstract class Base {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

// First child class implementing m1()
abstract class ChildM1 extends Base {
    void m1() {
        System.out.println("Abstract method 1");
    }
}

// Second child class extending ChildM1
class ChildM2 extends ChildM1 {
    void m2() {
        System.out.println("Abstract method 2");
    }

    void m3() {
        System.out.println("Abstract method 3");
    }
}

// Main class (should match file name: Abstract.java)
public class Abstract {
    public static void main(String[] args) {
        ChildM2 obj = new ChildM2();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
