import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.test2.Course;


public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config3.xml");
//        AllCollection all_collection = (AllCollection)context.getBean("all_collection");
//        List<String> listEle = all_collection.getListEle();
//        System.out.println("list"+listEle);
//        int[] arrayEle = all_collection.getArrayEle();
//        System.out.println("array"+ Arrays.toString(arrayEle));
//        Map<String, String> mapEle = all_collection.getMapEle();
//        System.out.println("map"+mapEle);
//        Set<String> setEle = all_collection.getSetEle();
//        System.out.println("setEle"+setEle);
//        Properties propEle = all_collection.getPropEle();
//        System.out.println("propEle"+propEle);
        Course autowire_test = (Course) context.getBean("autowire_test");
        System.out.println(autowire_test);


    }
}
