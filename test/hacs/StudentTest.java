package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heli Vachhani
 */

public class StudentTest {
    
    Student student = new Student();

	@Test
	public void testStudent() {
		int expected = 0;
		assertEquals(expected, student.type);
	}

	@Test
	public void testCreateCourseMenu() {
		CourseMenu courseMenu = student.createCourseMenu(new Course("CSE540", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}
    
}
