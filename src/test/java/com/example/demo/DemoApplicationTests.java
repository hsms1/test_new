package com.example.demo;

import com.example.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	Person person;
	@Test
	void contextLoads() {
		System.out.println(person);

	}

}
