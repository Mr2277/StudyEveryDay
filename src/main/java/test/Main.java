package test;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String wufu[]=str.split(",");
        int a[]=new int[5];
        for(String s:wufu){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '1'){
                    a[i]+=1;
                }
            }
        }
        int flag =0;
        int min=9999999;
        for(int i=0;i<5;i++){
            if(a[i] == 0){
                flag=1;
                break;
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        if(flag == 0){
            System.out.println(min);
        }
        else{
            System.out.println("0");
        }
    }
}
