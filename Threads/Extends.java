package Threads;

public class Extends extends Thread {
        public static void main(String[] args) {
            Extends thread = new Extends();
            thread.start();
            System.out.println("This code is outside of the thread");
        }
        public void run() {
            System.out.println("This code is running in a thread");
        }
    }
