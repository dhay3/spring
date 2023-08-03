package com.chz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chz.pojo.Student;

//继承该接口(要指定泛型是dto或是entity)不需要写mapper文件
public interface StudentDao extends BaseMapper<Student> {
}
