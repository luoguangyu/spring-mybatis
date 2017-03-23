package org.ivan.mybatis;

import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by Ivan.Luo
 * Date: 3/10/2017 4:11 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest
{
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	public void testUser() {
		ResponseEntity<User> responseEntity =this.restTemplate.getForEntity("/user/{id}",
				User.class, 1);

		User user = responseEntity.getBody();

		assertThat(user.getName()).isEqualTo("ivan");
	}
}
