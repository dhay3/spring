import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.test1.Student;
import test.test2.Course;

public class Test {
    public static void learnCourse() {//多次new后期维护麻烦
        Student s = new Student();
        s.learnJava();
        s.learnCpp();
    }

    public static void learnCourseWithFactory() {//简单工厂将创建课程的new集中模式获取,方便后期维护
        Student s = new Student();
        s.learn("c++");
    }
    public static void learnCourseWithIOC() {//简单工厂将创建课程的new集中用ioc管理
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        Student s = (Student)context.getBean("student");
        s.learn("java");
    }
    public static void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        Course course =(Course) context.getBean("course");
        System.out.println(course);
    }


    public static void main(String[] args) {
        //读取xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        //从spring ioc容器（di依赖注入）中获取一个id为s对象
        Student s = (Student) context.getBean("student");

        System.out.println(s);
//        s.hi();
//        System.out.println("----");
//        learnCourseWithFactory();
//        System.out.println("----");
//        learnCourseWithIOC();
//        testDI();

//        Course course_two = (Course)context.getBean("course_two");
//        System.out.println(course_two);
    }
}
