import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTime {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //从前端或者自己模拟一个日期格式，转为String即可

        //String dateStr = format.format(date);
        //System.out.println(dateStr);
    }
}
