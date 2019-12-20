package assignment_2.quickstart;

import junit.framework.TestCase;

import org.junit.Test;

import junit.framework.Assert;

public class StudentTest extends TestCase 
{
	@Test
	public void test_getAge() {
		Student student = new Student("Luke Slemon", "12/01/1998");
		
		int age = student.getAge();
		Assert.assertEquals(age, 21);
	}
	
	@Test
	public void test_username() {
		Student student = new Student("Luke Slemon", "12/01/1998");
		
		String username = student.getUsername();
		Assert.assertEquals(username, "Luke Slemon21");
	}
}




	

