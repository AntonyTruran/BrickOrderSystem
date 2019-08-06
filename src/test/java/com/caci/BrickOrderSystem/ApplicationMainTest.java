package com.caci.BrickOrderSystem;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.caci.BrickOrderSystem.utilities.OrderReferenceChecker;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(BrickOrderApiApplication.class)
public class ApplicationMainTest {
	@Test
	public void mainTest() {
		String arg[] = {""};
	}
}
