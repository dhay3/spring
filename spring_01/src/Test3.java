import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.test5_value.Teacher;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config-annotation.xml");
//        StudentDaoImpl student_dao = (StudentDaoImpl)context.getBean("student_dao");
//        StudentDaoImpl student_dao = (StudentDaoImpl)context.getBean("studentDaoImpl");
//        student_dao.addStudent(new Student());
        Teacher teacher =(Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }
}
