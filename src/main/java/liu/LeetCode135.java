package liu;

import java.util.Scanner;

public class LeetCode135 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int num=0;
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            int d[]=new int[n];
            for(int i=0;i<n;i++){
               num=sc.nextInt();
               a[i]=num;
            }
            int start=1;
            for(int i=0;i<n;i++){
               // System.out.println(a[i]);
                if(i< n-1){
                    if(a[i] < a[i+1]){
                        b[i]=start;
                        start++;
                        b[i+1]=start;
                    }
                    else{
                        b[i]=start;
                        start=1;
                    }
                }
            }
            start=1;
            for(int i=n-1;i>=0;i--){
                if(i>0){
                    if(a[i] < a[i-1]){
                        c[i]=start;
                        start++;
                        c[i-1]=start;
                    }
                    else{
                        c[i]=start;
                        start=1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(b[i] > c[i]){
                    d[i]=b[i];
                }
                else{
                    d[i]=c[i];
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(d[i]);
            }
        }
    }
}
