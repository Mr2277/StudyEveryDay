package test;

public class Run0115 {
    public static void main(String [] aegs){
         //byte b= byte[1024];
        for(int i=0;i<100;i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {

                    for (int i = 0; i < 10000000; i++) {
                            System.out.println(Thread.currentThread().getName()+"##"+i);
                    }
                }
            });
            thread.start();
        }
    }
}
