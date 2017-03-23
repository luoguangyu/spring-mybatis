package org.ivan.mybatis.service;

import org.ivan.mybatis.dao.UserDao;
import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 10:26 AM
 */
@Service
public class UserService
{
	//使用xml的方式定义mapper
	@Autowired
	UserDao userDao;

	// 直接使用注解的方式定义mapper
/*	@Autowired
	UserMapper userDao;*/

	public User getUser(int id)
	{
		return userDao.getUser(id);
	}
}
