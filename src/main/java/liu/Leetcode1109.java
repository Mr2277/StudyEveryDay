package liu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Leetcode1109 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        while(sc.hasNext()){
            int n=sc.nextInt();
            int count;
            int[][] a=new int[n][3];
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++){
                   count=sc.nextInt();
                   a[i][j]=count;
                }
            }
            int start=0;
            int end=0;
            int value=0;
           for(int i=0;i<n;i++){
               start=a[i][0];
               end=a[i][1];
               for(int j=start;j<=end;j++){
                   if(hashMap.get(j) !=null ){
                       value=hashMap.get(j);
                       value+=a[i][2];
                       hashMap.put(j,value);
                   }
                   else{
                       value=0;
                       value+=a[i][2];
                       hashMap.put(j,value);
                   }
               }
           }
            Iterator<Integer>iterator=hashMap.keySet().iterator();
           while(iterator.hasNext()){
               Integer key=iterator.next();
               Integer v=hashMap.get(key);
               System.out.println(key+"  "+v);
           }
        }
    }
}
