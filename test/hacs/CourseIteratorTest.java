package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heli Vachhani
 */

public class CourseIteratorTest {
    
    CourseIterator courseIterator = new CourseIterator();
	ClassCourseList classCourseList = new ClassCourseList();
    
    public CourseIteratorTest() {
    }

    @Test
    public void testHasNext() {
        Course course = new Course("CSE540", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertTrue(courseIterator.hasNext());
    }

    @Test
    public void testNext_0args() {
        Course course = new Course("CSE540", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next());
    }

    @Test
    public void testRemove() {

        int expected = 0;
		Course course = new Course("CSE540", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		courseIterator.next();
		courseIterator.remove();
		assertEquals(expected, courseIterator.getTheCourseList().size());
    }
    
    @Test
    public void testNext_String() {
        Course course = new Course("CSE540", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next("CSE540"));
    }
    
}
