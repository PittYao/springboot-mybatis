package com.mybatis.mybatis.service.impl;

import com.mybatis.mybatis.domain.Teacher;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.beans.Transient;
import java.util.List;

import com.mybatis.mybatis.dao.TeacherDao;
import com.mybatis.mybatis.service.TeacherService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Resource
    private TeacherDao teacherDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insert(Teacher teacher){
        return teacherDao.insert(teacher);
    }

    @Override
    public int insertSelective(Teacher teacher){
        return teacherDao.insertSelective(teacher);
    }

    @Override
    public int insertList(List<Teacher> teachers){
        return teacherDao.insertList(teachers);
    }

    @Override
    public int update(Teacher teacher){
        return teacherDao.update(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherDao.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }
}
