package Threads;

public class Sleep {
    public static void main(String[] args) {
        System.out.println("thread start");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("thread intreputed");
        }
        System.out.println(" thread wake up after 3 second");
    }
}

