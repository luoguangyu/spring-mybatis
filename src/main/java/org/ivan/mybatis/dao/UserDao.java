package org.ivan.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ivan.mybatis.domain.User;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 10:37 AM
 */
//使用Mapper注解声明该接口为mybatis的dao接口
@Mapper
public interface UserDao
{
	User getUser(int id);
}
