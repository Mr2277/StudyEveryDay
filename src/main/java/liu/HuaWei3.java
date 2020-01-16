package liu;

import java.util.Scanner;

public class HuaWei3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a[]=new String[2];
            while(sc.hasNext()) {
                for(int i=0;i<2;i++) {
                    //String[i]a = sc.nextLine();
                    //String b = sc.nextLine();
                    a[i]=sc.nextLine();
                }
                for(int j=0;j<2;j++) {
                    int count = 0;
                    if (a[j].length() <= 8) {
                        for (int i = 0; i < a[j].length(); i++) {
                            System.out.print(a[j].charAt(i));
                            count++;
                        }
                        if (count < 8) {
                            for (int i = count; i < 8; i++) {
                                System.out.print("0");
                                count++;
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < a[j].length(); i++) {
                            System.out.print(a[j].charAt(i));
                            count++;
                            if (count == 8) {
                                System.out.println();
                                count = 0;
                            }
                        }
                        if (count < 8 && count!=0 ) {
                            for (int i = count; i < 8; i++) {
                                System.out.print("0");
                                count++;
                            }
                            System.out.println();

                        }

                    }
                }

            }
    }
}
