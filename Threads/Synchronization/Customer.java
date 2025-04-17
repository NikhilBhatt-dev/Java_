// The bus class implements the Runnable interface.
class Bus implements Runnable{ 
      // Create a bus object with 1 available seat  
    int available = 2,passengers ;
            // The bus class has a constructor that takes the number of passengers as an argument.
    Bus(int passengers){
        this.passengers = passengers;

    }
    // and start three threads to simulate customers trying to book tickets.
    public  synchronized void run(){
        // public static void run(); // ❌ This won’t override Runnable.run()

        //after using synchronized keyword, only one thread can access this method at a time.
        // This ensures that the booking process is thread-safe, meaning that multiple threads cannot interfere with each other while trying to book tickets.
        
        // The run method of the bus class checks if there are enough available seats.
       
        String name = Thread.currentThread().getName();
        if(available>= passengers){
            System.out.println("Booking " + name + " tickets.");
            System.out.println("Tickets booked successfully for " + name + ". Remaining seats: " + (available - passengers)); // If there are enough seats, it prints a message indicating the booking was successful.
            available -= passengers; // If there are enough seats, it books the tickets and reduces the available seats.
            
        }
        else{
            System.out.println("Not enough seats available for " + name + ". Booking failed."); // If not, it prints a message indicating the booking failed.
        }
    }
}

public  class Customer {
    public static void main(String[] args) {
    Bus r = new Bus(1);
     // Each thread will attempt to book 1 seat.
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r); 
    Thread t3 = new Thread(r);
    t1.setName("Chetan");
    t2.setName("nikhil");
    t3.setName("sachin");
    // Start the threads to simulate customers trying to book tickets.
    t1.start();
    t2.start();
    t3.start();
    // The main method creates three threads, each representing a customer trying to book tickets.
}

}
