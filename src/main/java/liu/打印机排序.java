package liu;

import java.util.Arrays;
import java.util.Scanner;

public class 打印机排序 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(a);
            for(int i=n-1 ;i>=0;i--){
                for(int j=0;j<n;j++){
                    if(b[j] == a[i]){
                        System.out.print(j+1);
                    }
                }
                if(i!=0){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
