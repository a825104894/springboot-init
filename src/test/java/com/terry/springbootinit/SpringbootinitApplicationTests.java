package com.terry.springbootinit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootinitApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
		boolean isContain=context.containsBean("helloPerson");
		System.out.println("IOC容器是否包含该组件:"+isContain);
	}

}
