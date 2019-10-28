package thread.join;
class A1026 extends Thread{


    @Override
    public void run() {
        System.out.println(System.currentTimeMillis()+"A");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class B1026 implements Runnable{
    private A1026 a1026;
    B1026(A1026 a1026){
        this.a1026=a1026;
    }
    public void run() {
        /*
        try {
            a1026.start();
            a1026.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()+"B");
        int i
        */
        int i=0;
        while( i<2000000000) {
            //System.out.println(System.currentTimeMillis() + "B");
              if(Thread.currentThread().isInterrupted()){
                   break;
              }
        }
    }

}
public class testjoin1026 {
    public static void main(String[] args) throws InterruptedException {
        A1026 a1026=new A1026();
        B1026 b1026=new B1026(a1026);
        Thread threadA=new Thread(a1026);
        Thread threadB=new Thread(b1026);
         threadB.start();
         Thread.sleep(5000);
         System.out.println(threadB.isInterrupted());
         threadB.interrupt();
         System.out.println(threadB.isInterrupted());

        System.out.println(System.currentTimeMillis()+"main");
    }
}
