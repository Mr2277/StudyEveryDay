package liu;

import java.util.UUID;

public class test1008 {
    public static void main(String [] args){
        /*
        String str="上海众鼎实业有限公司";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("%");
        stringBuilder.append(str);
        stringBuilder.append("%");
        System.out.println(stringBuilder.toString());
        /*

         */
        //String uuid = UUID.randomUUID().toString();
        //System.out.println(uuid);
        String H_HNAME_FINAL="固原精英集团机动车驾驶员培训学校（有限公司）";
        H_HNAME_FINAL=H_HNAME_FINAL.replace("（","(").replace("）",")");
        System.out.println(H_HNAME_FINAL);
        if(!H_HNAME_FINAL.equals("字段错误")){
            System.out.println("fff");
        }
    }
}
