package org.ivan.mybatis.service;

import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by Ivan.Luo
 * Date: 3/13/2017 4:28 PM
 */
@RunWith(SpringRunner.class)
public class UserServiceTest
{
	@MockBean
	private UserMapper userMapper;

	@Before
	public void setup() {
		given(this.userMapper.getUser(123)).willReturn(new User(123, "sboot"));
	}

	@Test
	public void test() {

		User user = userMapper.getUser(123);

		assertThat(user.getName()).isEqualTo("sboot");
	}
}
