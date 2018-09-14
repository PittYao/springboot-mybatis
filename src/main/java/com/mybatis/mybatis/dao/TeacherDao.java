package com.mybatis.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.mybatis.mybatis.domain.Teacher;

@Mapper
public interface TeacherDao {
    int insert(@Param("teacher") Teacher teacher);

    int insertSelective(@Param("teacher") Teacher teacher);

    int insertList(@Param("teachers") List<Teacher> teachers);

    int update(@Param("teacher") Teacher teacher);

    Teacher findById(@Param("id")Integer id);

    List<Teacher> findAll();
}
