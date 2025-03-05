class Phone {
    void showTime() {
        System.out.println("Time is 12:00");
    }

    void on() {
        System.out.println("Turning on Phone");
    }
}

class Smartphone extends Phone {
    @Override
    void on() {
        // Overriding the 'on' method from Phone class
        System.out.println("Turning on Smartphone");
    }

    void playMusic() {
        System.out.println("Playing music");
    }
}

public class overriding {
    public static void main(String[] args) {
        Phone obj1 = new Phone();         // Parent class reference and object
        Smartphone obj2 = new Smartphone(); // Child class reference and object
        Phone obj3 = new Smartphone();     // Parent class reference, Child class object

        System.out.println("Calling methods from Phone object:");
        obj1.on();      // Calls Phone's on()
        obj1.showTime();

        System.out.println("\nCalling methods from Smartphone object:");
        obj2.on();      // Calls overridden on() from Smartphone
        obj2.showTime();
        obj2.playMusic();

        System.out.println("\nCalling methods from Phone reference but Smartphone object:");
        obj3.on();      // Calls overridden on() from Smartphone
        obj3.showTime();
        // obj3.playMusic(); // Error: Parent reference cannot access child-specific methods
    }
}
