package chz.com.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Student {
    private String name;
    private Integer age;
    private Address address;

    public Student(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
