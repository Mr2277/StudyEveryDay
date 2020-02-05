package test;

import java.util.ArrayList;
import java.util.List;

abstract  class test0203 {
    public int start;
    public static String stat;

    public String say(){
        return String.valueOf(start);
    }
    public static String saystatic(int start){
        return String.valueOf(start);
    }
    public static String saystatic(String start){
        return start;
    }
    public static String saystatic(String sta,int start){
        return sta;
    }
    public static String saystatic(int start,String s){
        return s;
    }
}
public class Run0203 extends test0203{

    Run0203(int start) {

    }
    public static void main(String[] args){
       System.out.println(new Run0203(3).say());
       System.out.println(Run0203.saystatic("ello"));
       System.out.println(4/0);
       List<String> list=new ArrayList<String>();
        //new Run033331(4).toString();
    }
}
