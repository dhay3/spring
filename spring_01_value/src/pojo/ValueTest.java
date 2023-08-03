package pojo;

import org.springframework.beans.factory.annotation.Value;

//@Component("valueTest")
public class ValueTest {
    //@Value("${})赋值properties的key
    @Value("${name}")
    private String name;

    //@Value("#{}")赋值JavaBean的属性
    @Value("#{student.age}")
    private String age;

//    @Value("22")字面量可以直接赋值
//    @Value("2*3")如果想要在value中运算要用spEL
    @Value("#{2*3}")
    private int num;

    @Value("#{1>3}")//可以用做比较
    private boolean gender;

    @Value("#{(1>3)?'黑':'白'}")//可以用三目运算
    private String black;

    @Override
    public String toString() {
        return "ValueTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", num=" + num +
                ", gender=" + gender +
                ", black='" + black + '\'' +
                '}';
    }
}
