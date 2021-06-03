package pl.krystian;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitPractise {
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@Test
	void test() {
		System.out.println("Test1 is running");
	}
	
	@Test
	void test2() {
		System.out.println("Test2 is running");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}

}
