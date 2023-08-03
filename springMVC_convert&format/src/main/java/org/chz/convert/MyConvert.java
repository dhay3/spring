package org.chz.convert;

import org.chz.entity.Student;
import org.springframework.core.convert.converter.Converter;
//转换器（如果输入和接收的参数类型不一致就会触发）,
// 第一个泛型指前端的参数类型，后一个泛型指前端转换到后端的参数类型,需要配置到springMVC中
public class MyConvert implements Converter<String, Student> {

    @Override
    public Student convert(String source) {
        String[] split = source.split("-");
        Student student = new Student();
        student.setId(Integer.parseInt(split[0]));
        student.setName(split[1]);
        student.setAge(Integer.parseInt(split[2]));
        return student;
    }
}
