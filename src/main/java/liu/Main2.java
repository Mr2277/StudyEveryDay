package liu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double price=sc.nextDouble();
            double min=999999;
            int M=9999999;
            int N=9999999;
            double cha=99999;

            if(Math.ceil(price) == 1){
                for(int i=1;i<10000;i++){
                   for(int j=i;j<=10000;j++){
                        double a=i;
                        double b=j;
                        double result=a/b;
                        if(result > price){
                             cha=result-price;
                        }
                        else{
                             cha=price-result;
                        }
                        if(cha <min){
                            min=cha;
                            M=i;
                            N=j;
                        }
                       //System.out.println(i/j);
                       //System.out.println(price-i/j);
                       //double result=i/j;
                       //System.out.println(result);
                   }
                }
            }
            else{
                for(int i=2;i<10*10000;i++){
                    for(int j=1;j<i;j++){
                        if(j>10000){
                            //break;
                            //continue;
                        }
                        double a=i;
                        double b=j;
                        double result=a/b;
                        if(result > price){
                            cha=result-price;
                        }
                        else{
                            cha=price-result;
                        }
                        if(cha <min){
                            min=cha;
                            M=i;
                            N=j;
                        }
                    }
                }
            }
            System.out.println(M+" "+N);
        }
    }
}
