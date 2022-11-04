package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heli Vachhani
 */

public class InstructorTest {
    
    Instructor instance = new Instructor();
    
    public InstructorTest() {
    }
    
    @Test
	public void testCreateCourseMenu() {
		CourseMenu courseMenu = instance.createCourseMenu(new Course("CSE540", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}

	@Test
	public void testInstructor() {
		int expected = 1;
		assertEquals(expected, instance.type);
	}
    
}
