package liu;

import java.util.Scanner;

public class 题目一 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[]{10,7,5,4};
        int max=0;
        int flag=0;
        for(int i=1;i<=120;i++){
            for(int j=0;j<4;j++){ // 找出最大的数字 以及对应的数组索引
                if(num[j]>max){
                    max=num[j];
                    flag=j;
                }
            }
            for(int k=0;k<4;k++){ // 减三和减一操作
                if(k == flag){
                    num[k]-=3;
                }
                else{
                    num[k]+=1;
                }
            }
            max=0;
            flag=0;
            for(int m=0;m<4;m++){
                System.out.print(num[m]+" ");
            }
            System.out.println();
        }


    }
}
