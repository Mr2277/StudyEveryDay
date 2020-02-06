package liu;

import java.util.*;

public class 题目二 {
    public static HashMap<String,Integer>hashMap=new HashMap<String,Integer>();
    public static Set<Integer> set=new HashSet<>();
    public static void dfs(int num1,int num2,Set<Integer>set,int level){
           if(level == 1){
               for(int i=1;i<=8;i++){        //深度搜索  第一层调用  满足第一个等式 加入哈map  同时在set里删除
                   hashMap.put("a",i);
                   hashMap.put("b",9-i);
                   set.remove(i);
                   set.remove(9-i);
                   dfs(i,9-i,set,2);
                   set.add(i);
                   set.add(9-i);
                   hashMap.remove("a");
                   hashMap.remove("b");
               }
           }
           if(level == 2){
               //System.out.println(set.size());
               //System.out.println(hashMap.size());
               for(int i=1;i<7;i++){
                   if(set.contains(i) && set.contains(7-i)){      //深度搜索 第二层
                        hashMap.put("c",i);
                        hashMap.put("d",7-i);
                        set.remove(i);
                        set.remove(7-i);
                        dfs(i,7-i,set,3);
                        set.add(i);
                        set.add(7-i);
                        hashMap.remove("c");
                        hashMap.remove("d");
                   }

               }
           }
           if(level == 3){
               for(int i=1;i<=8;i++){
                   if(set.contains(i) && set.contains(i+2)){
                       hashMap.put("f",i);
                       hashMap.put("e",i+2);
                       set.remove(i);
                       set.remove(i+2);
                       dfs(i,i+2,set,4);
                       set.add(i);
                       set.add(i+2);
                       hashMap.remove("f");
                       hashMap.remove("e");
                   }
                   if(set.contains(i) && set.contains(i-2)){
                       hashMap.put("e",i);
                       hashMap.put("f",i-2);
                       set.remove(i);
                       set.remove(i-2);
                       dfs(i,i-2,set,4);
                       set.add(i);
                       set.add(i-2);
                       hashMap.remove("e");
                       hashMap.remove("f");
                   }
               }
           }
           if(level == 4){
              for(int i=1;i<=8;i++){
                  if(set.contains(i) && set.contains(i+1)){
                      hashMap.put("h",i);
                      hashMap.put("g",i+1);
                      set.remove("i");
                      set.remove(i+1);
                      if(set.isEmpty()){
                          for(String key:hashMap.keySet()){
                              System.out.println(key+","+hashMap.get(key));
                          }
                      }
                  }
                  if(set.contains(i) && set.contains(i-1)){
                      hashMap.put("g",i);
                      hashMap.put("h",i-1);
                      set.remove(i);
                      set.remove(i-1);
                      if(set.isEmpty()){
                          for(String key:hashMap.keySet()){
                              System.out.println(key+","+hashMap.get(key));
                          }
                      }
                  }
              }
           }
    }

    public static void main(String[] args){
        for(int i=1;i<=8;i++){
            set.add(i);
        }
       dfs(0,0,set,1);
    }
}
