package org.ivan.mybatis.mapper;

import org.ivan.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 10:25 AM
 */
// 注解为Mapper，作用相当于UserDaoMapper.xml文件，使用注解的方式写
// 相当于DAO层，直接被service调用

//@Mapper
public interface UserMapper
{
	//@Select("SELECT * FROM USER WHERE id = #{id}")
	User getUser(int id);
}
