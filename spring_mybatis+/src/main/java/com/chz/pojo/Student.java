package com.chz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//property 如sNo会转成s_no,一般表中的字段名带下划线
@TableName("student")//默认类名首字母小写就是表名
public class Student {
//    如果不传sno表中要勾选自动自增，type=IdType.AUTO表示自增（表中要勾选自动自增）
    @TableId(value = "sno",type = IdType.AUTO)//@TableId（主键） @TableField value表示封装对应字段名
    private Integer sNo;
    @TableField(value = "sname")
    private String sName;
    @TableField(value = "sage")
    private Integer sAge;
    @TableField(exist = false)//如果不是数据库的字段要加@TableField（exist=false）
    private Boolean gender;

    public Student(String sName, Integer sAge) {
        this.sName = sName;
        this.sAge = sAge;
    }

    public Student(Integer sNo, String sName, Integer sAge) {
        this.sNo = sNo;
        this.sName = sName;
        this.sAge = sAge;
    }
}
