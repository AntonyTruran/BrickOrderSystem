package com.caci.BrickOrderSystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;

import com.caci.BrickOrderSystem.controllerTests.ControllerTest;
import com.caci.BrickOrderSystem.repositoryTests.RepositoryTest;
import com.caci.BrickOrderSystem.serviceTests.ServiceTest;
import com.caci.BrickOrderSystem.utilityTests.OrderReferenceCheckTest;

@RunWith(Suite.class)

@SuiteClasses({ ApplicationMainTest.class, ControllerTest.class, RepositoryTest.class, ServiceTest.class, OrderReferenceCheckTest.class})

@SpringBootTest
public class TestSuite {

}