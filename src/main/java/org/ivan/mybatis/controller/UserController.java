package org.ivan.mybatis.controller;

import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 10:52 AM
 */
@RestController
@RequestMapping(value = "user")
public class UserController
{
	private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable(value = "id") int id)
	{
		LOGGER.debug("getting user with id: " + id);
		User user = userService.getUser(id);
		LOGGER.debug("retrieved user: " + user);
		return user;
	}
}
