package liu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HuaWei2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            while(sc.hasNext()) {
                int num = sc.nextInt();
                Set set = new TreeSet<Integer>();
                for (int i = 0; i < num; i++) {
                    int a = sc.nextInt();
                    set.add(a);
                }
                Iterator<Integer> iterator = set.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next() + " ");
                }

            }


    }
}
