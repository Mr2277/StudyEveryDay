package liu;

import java.util.*;

public class HuaWei7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> hashMap= new TreeMap<Integer, Integer>();
        while(sc.hasNext()){
            int num=sc.nextInt();
            for(int i=0;i<num;i++){
                int key=sc.nextInt();
                int value=sc.nextInt();
                if(hashMap.isEmpty()){
                    hashMap.put(key,value);
                }
                else{
                    if(hashMap.get(key) != null){
                        int mValue=hashMap.get(key);
                        mValue+=value;
                        hashMap.put(key,mValue);
                    }
                    else{
                        hashMap.put(key,value);
                    }
                }
            }
             hashMap.forEach((key,value)->{
                 System.out.println(key+" "+value);
             });
         }
    }
}
