package com.mybatis.mybatis.service.impl;

import com.mybatis.mybatis.domain.ClassRoom;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.mybatis.mybatis.dao.ClassRoomDao;
import com.mybatis.mybatis.service.ClassRoomService;

@Service
public class ClassRoomServiceImpl implements ClassRoomService{

    @Resource
    private ClassRoomDao classRoomDao;

    @Override
    public int insert(ClassRoom classRoom){
        return classRoomDao.insert(classRoom);
    }

    @Override
    public int insertSelective(ClassRoom classRoom){
        return classRoomDao.insertSelective(classRoom);
    }

    @Override
    public int insertList(List<ClassRoom> classRooms){
        return classRoomDao.insertList(classRooms);
    }

    @Override
    public int update(ClassRoom classRoom){
        return classRoomDao.update(classRoom);
    }

    @Override
    public ClassRoom findById(Integer id) {
        return classRoomDao.findById(id);
    }
}
