import java.lang.Thread;

class Test extends Thread {
    public void run() {
                System.out.println("A1="+Thread.interrupted());
                System.out.println("B1="+Thread.currentThread().isInterrupted());
                System.out.println("A2="+Thread.interrupted());
                System.out.println("B2="+Thread.currentThread().isInterrupted());
                try{
                    for(int i=0;i<=5;i++){
                        Thread.sleep(1000);
                        System.out.println(i);
                    }
                }catch(InterruptedException e){
                    System.out.println("Thread is interrupted");
                }    
            
            }
}

public class Isinterrupted {
    public static void main(String[] args) {
        Test T = new Test();
        T.start();
        // T.interrupt();

    }
}
