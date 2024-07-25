package com.itc.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItcJenkinsApplicationTests {
	Logger logger = LoggerFactory.getLogger(ItcJenkinsApplication.class);


	@Test
	void contextLoads() {
		logger.info("**********test case executed***********");
		assertEquals(true, true);
	}

}
