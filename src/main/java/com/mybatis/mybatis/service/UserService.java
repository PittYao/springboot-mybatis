package com.mybatis.mybatis.service;
import java.util.List;

import com.mybatis.mybatis.domain.User;

public interface UserService {
    int insertUser(User user);

	User findById(String id);



}
