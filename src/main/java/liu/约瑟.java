package liu;

import java.util.Scanner;

public class 约瑟 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=0;
            for(int i=2;i<=n;i++){
                s=(s+m)%i;
            }
            System.out.print(s+1);
        }
    }
}
