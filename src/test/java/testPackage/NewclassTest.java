package testPackage;

import org.testng.annotations.Test;

public class NewclassTest {
	@Test
	public void newTest() {
		System.out.println("Class added by Lead");
		System.out.println("new change by lead");
		System.out.println("changes by collaborator");
		System.out.println("another by collab");
	}
	
	@Test
	public void addedTest() {
		System.out.println("Added test script to check conflict process");
	}
	
	@Test
	public void collaboratorTest() {
		System.out.println("push by collab");
	}

}
