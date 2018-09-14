package com.mybatis.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.mybatis.mybatis.domain.ClassRoom;

@Mapper
public interface ClassRoomDao {
    int insert(@Param("classRoom") ClassRoom classRoom);

    int insertSelective(@Param("classRoom") ClassRoom classRoom);

    int insertList(@Param("classRooms") List<ClassRoom> classRooms);

    int update(@Param("classRoom") ClassRoom classRoom);

    ClassRoom findById(@Param("id")Integer id);
}
