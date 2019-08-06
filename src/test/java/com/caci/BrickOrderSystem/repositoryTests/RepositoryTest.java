package com.caci.BrickOrderSystem.repositoryTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.caci.BrickOrderSystem.repository.BrickOrderRepo;
import com.caci.BrickOrderSystem.utilities.OrderReferenceChecker;

@RunWith(SpringRunner.class)
@SpringBootTest

@WebMvcTest(BrickOrderRepo.class)
public class RepositoryTest {
	@Autowired
	BrickOrderRepo brickOrderRepo;

	@Test 
	public void contextLoads() {
		assertThat(brickOrderRepo).isNotNull();
	}
}
