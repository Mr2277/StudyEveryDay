package liu;

import javax.security.sasl.SaslClient;
import java.util.*;

public class 两个列表 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[2*n];
            int min[]=new int[n];
            int max[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                c[i]=a[i];
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
                c[i+n]=b[i];
            }
            Arrays.sort(c);
            int k=0;
            int m=0;
            max[k++]=c[2*n-1];
            min[m++]=c[2*n-2];
            int summax=max[0];
            int summin=min[0];
            for(int i=2*n-3;i>=0;i=i-2){
                if(summax - summin >= 0){
                    min[m++]=c[i];
                    max[k++]=c[i-1];
                    summax+=c[i-1];
                    summin+=c[i];
                }
                else{
                    min[m++]=c[i-1];
                    max[k++]=c[i];
                    summax+=c[i];
                    summin+=c[i-1];
                }

            }
            for(int i=0;i<k;i++) {
                System.out.print(max[i]+",");
            }
            System.out.println();
            for(int i=0;i<m;i++){
                System.out.print(min[i]+",");

            }
            System.out.println();

            if(summax>=summin){
                System.out.println(summax-summin);
            }
            else{
                System.out.println(summin-summax);
            }

        }
    }
}
