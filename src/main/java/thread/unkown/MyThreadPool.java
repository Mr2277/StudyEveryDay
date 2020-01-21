package thread.unkown;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();
        //threadPoolExecutor.s
        /*
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        for(int i=0;i<=10;i++) {
              Thread thread=new Thread(new Runnable() {
                  @Override
                  public void run() {
                      System.out.println(Thread.currentThread().getName());
                  }
              });
             FutureTask<String>futureTask= (FutureTask<String>) executorService.submit(thread);
             System.out.println(futureTask.get());
        }*/
        ExecutorService executorService=Executors.newFixedThreadPool(4);
        for (int i=0;i<100000000;i++){
            System.out.println(i);
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                     System.out.println(Thread.currentThread().getName()+"######"+System.currentTimeMillis());
                }
            });
        }

    }
}
