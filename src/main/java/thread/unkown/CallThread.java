package thread.unkown;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCall implements Callable{

    public String call() throws Exception {
        return "hello";
    }
}
public class CallThread {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        MyCall myCall=new MyCall();
        FutureTask<String>futureTask=new FutureTask<String>(myCall);
        Thread thread=new Thread(futureTask);
        thread.start();
        futureTask.get();
    }
}
