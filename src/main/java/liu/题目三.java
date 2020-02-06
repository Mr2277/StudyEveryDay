package liu;

public class 题目三 {
    public static void main(String[] args){
        for(int i=10;i<=99;i++){
            for(int j=i+1;j<=99;j++){
                int ai=i/10;
                int bi=i%10;
                int aj=j/10;
                int bj=j%10;
                int opti=bi*10+ai;
                int optj=bj*10+aj;
                if( i*j == opti*optj){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
