class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);  // Simulates work by sleeping for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Join {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3= new MyThread();

        thread1.start();  // Start thread1
        try {
            thread1.join();  // Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        thread2.start();  // thread2 starts only after thread1 finishes
        thread3.start();
    }
}