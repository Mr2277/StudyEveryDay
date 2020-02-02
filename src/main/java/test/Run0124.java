package test;
class Father{
    Father(){
        System.out.println("Father");
    }
    static{
        System.out.println("Father Static");
    }
    {
        System.out.println("Father{}");
    }
}
class Child extends Father{
    Child(){
        System.out.println("Child");
    }
    static{
        System.out.println("Child static");
    }
    {
        System.out.println("Child{}");
    }
}
public class Run0124 {
    public static void main(String [] args){
        Child child=new Child();
    }
}
