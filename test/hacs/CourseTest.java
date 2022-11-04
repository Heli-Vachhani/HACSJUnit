package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heli Vachhani
 */

public class CourseTest {
    
    public CourseTest() {
    }
    
    @Test
	public void testAddAssignment() {
		Course testCourse= new Course("CSE540", 0);
		testCourse.addAssignment(new Assignment());
		assertEquals(testCourse.getAssignmentList().size(), 1);
	}
    
}
