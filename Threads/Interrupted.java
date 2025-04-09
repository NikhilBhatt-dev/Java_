import java.lang.Thread;
class Test extends Thread {
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }    
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class Interrupted {
    public static void main(String[] args) {
        Test T = new Test();
        T.start();
        T.interrupt();
    }
    
}
