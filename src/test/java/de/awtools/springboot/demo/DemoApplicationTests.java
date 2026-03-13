package de.awtools.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		org.assertj.core.api.Assertions.assertThat(true).isTrue();
	}

	@Test
	void failed() {
		// org.assertj.core.api.Assertions.assertThat(true).isFalse();
	}

}
