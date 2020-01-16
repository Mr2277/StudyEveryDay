package liu;

import java.util.Scanner;

public class HuaWei4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num = sc.nextLine();
            num=num.replace("0x","");
            System.out.println(num);
            System.out.println(num.length());
            int sum=0;
            for(int i=0;i<num.length();i++){
                char ch=num.charAt(i);
                if('0' <= ch && ch<='9' ){
                    sum+=Math.pow(ch,num.length()-i);
                }
                switch (ch){
                    case 'A': sum+=Math.pow(10,num.length()-i);
                        break;
                    case 'B': sum+=Math.pow(11,num.length()-i);
                        break;
                    case 'C': sum+=Math.pow(12,num.length()-i);
                        break;
                    case 'D': sum+=Math.pow(13,num.length()-i);
                        break;
                    case 'E': sum+=Math.pow(14,num.length()-i);
                        break;
                    case 'F': sum+=Math.pow(15,num.length()-i);
                        break;
                }
            }
            System.out.println(sum);
        }
    }
}
