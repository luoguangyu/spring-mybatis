package org.ivan.mybatis.dao;

import org.ivan.mybatis.domain.User;
import org.ivan.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Ivan.Luo
 * Date: 3/13/2017 4:19 PM
 *
 *
 @JbaTest will
 Configure an in-memory database.
 Auto-configure Hibernate, Spring Data and the DataSource.
 Perform an @EntityScan.
 Turn on SQL logging

 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest
{
	@Autowired
	private UserMapper repository;

	@Test
	public void findByUsernameShouldReturnUser() {
		User user = repository.getUser(1);

		assertThat(user.getId()).isEqualTo(1);
		assertThat(user.getName()).isEqualTo("ivan");
	}
}
