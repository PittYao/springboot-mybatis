package com.mybatis.mybatis.service.impl;
import java.util.List;

import com.mybatis.mybatis.dao.UserDao;
import com.mybatis.mybatis.domain.User;
import com.mybatis.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.insert(user);
    }

	@Override
	public User findById(String id){
		 return userDao.findById(Integer.valueOf(id));
	}



}
