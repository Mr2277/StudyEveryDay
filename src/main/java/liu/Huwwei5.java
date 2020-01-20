package liu;

import java.util.Scanner;

public class Huwwei5 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        long num=sc.nextLong();
        for(int i=2;i<=num;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
    }
}
