package liu;

import java.util.Scanner;

public class Leetcode547 {
    public static void  find(int[] flag,int[][] map,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(flag[i] == 0){
                flag[i]=1;
                count++;
                dfs(map,n,i,flag);
            }
        }
        System.out.println(count);
    }
    public static void dfs(int[][]map,int n,int start,int[] flag ){
        if(start <n-1 ){
            if(map[start][start+1] == 1){
                flag[start+1]=1;
                dfs(map,n,start+1,flag);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[][] map=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int count=sc.nextInt();
                    map[i][j]=count;
                }
            }
            int[] flag=new int[n];
            for(int i=0;i<n;i++){
                flag[i]=0;
            }
            find(flag,map,n);

        }
    }
}
