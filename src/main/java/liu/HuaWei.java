package liu;


import java.util.Scanner;

public class HuaWei {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a =s.nextLine();
        String str=s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(str.equals(a.substring(i,i+1)) || str.toLowerCase().equals(a.substring(i,i+1)) || str.toUpperCase().equals(a.substring(i,i+1))){
                //System.out.println(a.charAt(i));
                count++;
            }

        }
        System.out.println(count);
    }
}
