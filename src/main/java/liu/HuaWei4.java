package liu;

import java.util.Scanner;

public class HuaWei4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num = sc.nextLine();
            num=num.replace("0x","");
            int sum=0;
            for(int i=0;i<num.length();i++){
                char ch=num.charAt(i);
                if('0' <= ch && ch<='9' ){
                    int number=Integer.parseInt(String.valueOf(ch));
                   // System.out.println(number);
                    sum+=number*(Math.pow(16,num.length()-i-1));
                }
                switch (ch){
                    case 'A': sum+=10*(Math.pow(16,num.length()-i-1));
                        break;
                    case 'B': sum+=11*(Math.pow(16,num.length()-i-1));
                        break;
                    case 'C': sum+=12*(Math.pow(16,num.length()-i-1));
                        break;
                    case 'D': sum+=13*(Math.pow(16,num.length()-i-1));
                        break;
                    case 'E': sum+=14*(Math.pow(16,num.length()-i-1));
                        break;
                    case 'F': sum+=15*(Math.pow(16,num.length()-i-1));
                        break;
                }
            }
            System.out.println(sum);
        }
    }
}
