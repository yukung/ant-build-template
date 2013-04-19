package org.yukung;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class HelloTest {
	
	@Test
	public void testHello() throws Exception {
		Hello target = new Hello();
		assertThat(target.hello(), is("Hello, world!"));
	}
}
