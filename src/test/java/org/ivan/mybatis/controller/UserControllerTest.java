package org.ivan.mybatis.controller;

import org.ivan.mybatis.controller.UserController;
import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.mapper.UserMapper;
import org.ivan.mybatis.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Ivan.Luo
 * Date: 3/13/2017 5:06 PM
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest
{

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@MockBean
	private UserService userService;

	@MockBean
	private UserMapper userMapper;

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	// integration test for user
	@Test
	public void getUserTest() throws Exception
	{
		given(this.userService.getUser(123))
				.willReturn(new User(123, "Civic"));

		String userJson = "{\"id\":123,\"name\":\"Civic\"}";

		this.mvc.perform(get("/user/123")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(userJson));
	}
}
