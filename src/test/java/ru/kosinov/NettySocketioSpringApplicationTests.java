package ru.kosinov;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.kosinov.conf.TestApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestApplicationConfiguration.class)
public class NettySocketioSpringApplicationTests {

	@Test
	public void contextLoads() {
	}

}
