import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class AA{
    private Integer integer =0;

}
public class FirstLesson {
    public static void main(String[] args) throws InterruptedException {
        //Byte b=new Byte((byte) ((byte) 1));
        //List<Byte> list=new ArrayList<>();
        List<AA>list=new ArrayList<>();
        while(true){
            for(int i=0;i<50000000;i++)
            list.add(new AA());
            list=null;
            Thread.sleep(1000000000);
        }


    }
}
