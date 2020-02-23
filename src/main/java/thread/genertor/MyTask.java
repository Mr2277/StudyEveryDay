package thread.genertor;

import java.io.Serializable;

public class MyTask implements Serializable,Runnable {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
