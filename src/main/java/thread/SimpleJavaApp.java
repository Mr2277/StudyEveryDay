package thread;

import java.util.Date;
class A implements Runnable{

    public void run() {
        System.out.println(new Date());
    }
}
public class SimpleJavaApp {
    public static void main(String [] args) throws InterruptedException {
        /*
        while(true){
            System.out.println(new Date());
            Thread.sleep(1000);
        }
        */
        A a=new A();
        Thread thread=new Thread(a);
        thread.start();
        a.run();
    }
}
