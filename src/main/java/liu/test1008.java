package liu;

public class test1008 {
    public static void main(String [] args){
        String str="上海众鼎实业有限公司";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("%");
        stringBuilder.append(str);
        stringBuilder.append("%");
        System.out.println(stringBuilder.toString());
    }
}
