package Threads;

class Demo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread: " + i);
            Thread.yield(); // hint to scheduler
        }
    }
}

public class Yield {
    public static void main(String[] args) {
        Demo t = new Demo(); // create a thread with logic
        t.start(); // start the thread

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            Thread.yield();
        }
    }
}
