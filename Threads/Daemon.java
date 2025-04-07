package Threads;

class MyDaemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println("Thread is daemon");
        else
            System.out.println("Thread is not daemon");
    }
}

public class Daemon  {
    public static void main(String[] args) {
        MyDaemon t1 = new MyDaemon();
        MyDaemon t2 = new MyDaemon();

        t1.setDaemon(true); // Must be set before start()

        t1.start();
        t2.start();
    }
}
