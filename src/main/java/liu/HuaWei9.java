package liu;

import java.util.HashMap;
import java.util.Scanner;

public class HuaWei9 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>hashMap=new HashMap<>();

        while(sc.hasNext()) {
            String str = sc.nextLine();

            for (int i = 0; i < str.length();i++){
                String ch= String.valueOf(str.charAt(i));
                if(hashMap.get(ch) == null){
                    hashMap.put(ch,1);
                }
                else{
                    Integer count=hashMap.get(ch);
                    count++;
                    hashMap.put(ch,count);
                }
            }
            System.out.println(hashMap.size());
            hashMap.clear();
        }
    }
}
