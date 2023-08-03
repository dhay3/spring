package test.test5_value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    //如果通过注解配置不需要get set
    @Value("ccp")
    private String name;
    @Value("56")
    private int age;
    public Teacher(String age){
//        this.age=age;报错
    }
    public Teacher(){

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
