package com.mybatis.mybatis.service;

import com.mybatis.mybatis.domain.ClassRoom;

import java.util.List;

public interface ClassRoomService{

    int insert(ClassRoom classRoom);

    int insertSelective(ClassRoom classRoom);

    int insertList(List<ClassRoom> classRooms);

    int update(ClassRoom classRoom);

    ClassRoom findById( Integer id);
}
