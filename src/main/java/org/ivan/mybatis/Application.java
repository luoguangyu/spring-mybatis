package org.ivan.mybatis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application
{
	/**
	 * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
	 */
/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}*/
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
