package pojo.dog;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Dog {
    private String name;

    public Dog() {
        System.out.println("dog无参构造器");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("dog有参构造器");
    }
}
