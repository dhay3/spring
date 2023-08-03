package org.chz.format;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

public class MyFormat {
    @NotBlank(message = "字符串是NotBlank")
    private String name;
    //后端必需添加@DateTimeFormat("yyyy-MM-dd")用来匹配前端的type为date(对应后端的类型是Date)的属性,否则后端接收为null
    @Past//以前时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Past(message = "必需是当前时间以前")
    private Date birthday;
    @NotNull(message = "基本类型是NotNull")
//    @NotNull(message = "不能为空")
    private int age;
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyFormat{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
