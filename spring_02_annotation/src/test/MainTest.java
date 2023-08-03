package test;

import org.springframework.stereotype.Component;

@Component
public class MainTest {
    public String mainFunction(String s){
        System.out.println(s+"--->MainFunction...");
        return "这是一个返回值";
    }
    public int mainFunctionAround(){
        System.out.println("2--->mainFunctionAround");
        return 100;
    }
    public void mainFunctionException(){
        System.out.println("3--->mainFunctionException");
        int[] a=new int[1];
        a[2]=3;
        System.out.println(1/0);
    }
}
