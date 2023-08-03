package org.chz.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class FormatTest {
    //添加注解格式化date对象,前端按照pattern格式传值,后端才能接收到
    @DateTimeFormat(pattern = "yyyy/MM/dd")//前端输入的格式也必需符合日期的格式
    private Date bir;
    //添加注解格式化数字类型,前端按照pattern格式化值,后端才能拿到值
    @NumberFormat(pattern = "#,#")
    private int num;

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FormatTest{" +
                "date=" + bir +
                ", num=" + num +
                '}';
    }
}
