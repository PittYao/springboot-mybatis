package com.mybatis.mybatis.service;

import java.util.List;
import com.mybatis.mybatis.domain.Teacher;
public interface TeacherService{

    int insert(Teacher teacher);

    int insertSelective(Teacher teacher);

    int insertList(List<Teacher> teachers);

    int update(Teacher teacher);

    Teacher findById(Integer id);

    List<Teacher> findAll();
}
