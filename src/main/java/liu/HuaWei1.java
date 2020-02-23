package liu;

import java.util.Scanner;

public class HuaWei1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            while(sc.hasNext()) {
                String s1 = sc.nextLine();
                String[] result=s1.split(" ");
                System.out.println(result[result.length-1].length());
            }


    }
}
