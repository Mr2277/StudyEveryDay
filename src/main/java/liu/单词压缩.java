package liu;

import java.util.*;

public class 单词压缩 {
    public static void minimumLengthEncoding(String[] words) {

        Set<String> stringSet = new HashSet<String>(Arrays.asList(words));
        /*
        Iterator<String>iterator=stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
          */
        for (String word : words) {
            for (int i = 1; i < word.length(); i++) {
                stringSet.remove(word.substring(i));
                //System.out.println(word.substring(i));
            }
        }

        for(String word :stringSet){
            System.out.println(word);
        }
        /*
        int count = 0;
        for (String s : stringSet) {
            count += s.length() + 1;
            System.out.println(s);
        }
        System.out.print(count);
        */
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String[] words=new String[n];
            sc.nextLine();
            for(int i=0;i<n;i++){
                words[i]=sc.nextLine();
            }

            minimumLengthEncoding(words);
        }
    }
}
