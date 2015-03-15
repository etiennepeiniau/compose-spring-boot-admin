package com.peiniau.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootAdminApplication.class)
public class SpringTestSpringBootAdminTests {

	@Autowired
	ApplicationContext ctx;

	@Test
	public void testContextLoads() throws Exception {
		assertNotNull(this.ctx);
		assertTrue(this.ctx.containsBean("springBootAdminApplication"));
	}

}
