package thread.unkown;

import java.util.Date;
class A implements Runnable{

    public void run() {
        while(true) {
            System.out.println(new Date());
        }
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
        A a1=new A();
        Thread thread=new Thread(a);
        Thread thread1=new Thread(a1);
        thread.start();
        thread1.start();
        a.run();
    }
}
