package liu;

import java.util.Scanner;

public class HuaWei11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String num= scanner.nextLine();
            String[] initialString=num.split(" ");
            for(int i=initialString.length-1;i>=0;i--){
                if(i > 0) {
                    System.out.print(initialString[i]+" ");
                }
                else{
                    System.out.println(initialString[i]);
                }
            }

        }
    }
}
