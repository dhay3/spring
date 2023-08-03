package test.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private int sno;
    private String name;
    private int age;

   public Student(int snoi, String namei, int agei) {//可以不给默认构造器以外的构造器
        this.sno = snoi;
        this.name = namei;
        this.age = agei;
    }

    public Student() {//必须要有无参构造器,反射调用

    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void hi() {
        System.out.println("hello world");
    }

    public void learnJava() {
        LearnCourse c = new JavaLearnCourse();
        c.learn();
    }

    public void learnCpp() {
        LearnCourse c = new CPPLearnCourse();
        c.learn();
    }

    public void learn(String name) {//学习任何课程
//        Course course = CourseFactory.getCourse(name);
//        if (course != null)
//            course.learn();

        //直接从ioc容器中获取
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        if (name.equals("java")) {
            JavaLearnCourse java = (JavaLearnCourse) context.getBean("java");
            java.learn();
        } else if (name.equals("cpp")) {
            CPPLearnCourse cpp = (CPPLearnCourse) context.getBean("cpp");
            cpp.learn();
        }
    }
}
