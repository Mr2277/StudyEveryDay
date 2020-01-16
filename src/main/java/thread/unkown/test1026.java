package thread.unkown;

public class test1026 {
    public static void main(String[] args) throws InterruptedException {
         System.out.println(System.currentTimeMillis()+"one");
         Thread thread = new Thread(new Runnable() {
             public void run() {
                 System.out.println(System.currentTimeMillis()+"two");
             }
         });//.start();
         thread.start();
         thread.join();
         System.out.println(System.currentTimeMillis()+"three");
    }
}
