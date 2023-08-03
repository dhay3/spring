package test1;

public class MainTest {
    public void maniFunctionBefore(String s) {
        System.out.println(s + "-->mainFunctionBefore...");
    }

    public void mainFunctionAfter() {
        System.out.println("2-->mainFunctionAfter...");
    }

    public void mainFunctionException() {
            System.out.println("3-->mainFunctionException");
            //主动抛出异常(如果try-catch或是上抛异常就不会调用afterThrowing)
            throw new NumberFormatException();
    }

    public String mainFunctionInterceptor(String s){
        System.out.println("4-->mainFunctionInterceptor");
//        return 1;
        return "执行完毕mainFunctionInterceptor";
    }

    @Override
    public String toString() {
        return "MainTest{}";
    }
}
