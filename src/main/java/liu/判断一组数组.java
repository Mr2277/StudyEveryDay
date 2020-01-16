package liu;

import java.util.Scanner;

public class 判断一组数组 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                System.out.print(a[i]);
                if(i<=n-2 && a[i+1] == a[i]+1){
                    System.out.print(",");
                }
                else{
                    System.out.println();
                }

            }
        }
    }

}
