import java.util.Scanner;

public class FirstLesson {
    public static void main(String[] args){
        int m=4;
        int n=4;
        char map[][]=new char[4][4];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || i == m-1){
                   map[i][j]='*';
                }
                if(j == 0 || j == n-1){
                    map[i][j]='*';
                }
            }
        }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(map[i][j]+" ");
           }
           System.out.println();
       }
    }
}
