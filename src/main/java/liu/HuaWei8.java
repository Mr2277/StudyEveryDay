package liu;

import java.util.*;

public class HuaWei8 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        Set<Integer> set=new LinkedHashSet<>();
        while(sc.hasNext()){
            String num=sc.nextLine();
            for(int i=num.length()-1;i>=0;i--){
                int ch=num.charAt(i)-'0';
                set.add(ch);
            }
            Iterator<Integer>iterator=set.iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next());
            }
        }
    }
}
