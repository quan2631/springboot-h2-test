package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootH2TestApplication {

	@Bean
	InitializingBean saveData(UserRepository repo){

		return ()->{
			User u = new User();
			u.setName("abc");
			repo.save(u);
			User u1 = new User();
			u1.setName("zyx");
			repo.save(u1);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2TestApplication.class, args);
	}

}
