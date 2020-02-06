package liu;

import java.util.Scanner;

public class Run0206 {
    public static void dfs(int[] num,int x,int y,int z,int level,int[] max){
        if(level == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j =  0; j < 10; j++) {
                    if(i == j){
                        continue;
                    }
                    for (int k = 0; k < 10; k++) {
                        if(i == k || k == j){
                            continue;
                        }
                          dfs(num,num[i],num[j],num[k],2,max);
                    }
                }
            }
        }
        else{
            int a1=x*x+x*y-y*y+z;
            if(a1<max[0]){
                max[0]=a1;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[10];
        int[] max=new int[1];
        while(sc.hasNext()){
            for(int i=0;i<10;i++) {
                int count = sc.nextInt();
                num[i]=count;

            }
            max[0]=999999999;
            dfs(num,0,0,0,1,max);
            System.out.println(max[0]);
        }
    }
}
