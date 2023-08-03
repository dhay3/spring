package test;

import org.springframework.stereotype.Component;

@Component
public class MainTest {
    public int mainFunction(){
        System.out.println("mainFunction...");
        return 100;
    }
    public void mainFunctionException(){
        System.out.println("mainException");
        int[] i = new int[2];
        i[3]=3;
        throw new NumberFormatException();
    }
}
