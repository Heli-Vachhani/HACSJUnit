package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heli Vachhani
 */

public class ClassCourseListTest {
    
    public ClassCourseListTest() {
    }
    
     @Test 
	  public void testFindCourseByCourseName() 
	  { 
		  ClassCourseList list = new ClassCourseList(); 
		  list.initializeFromFile(); 
		  Course course =list.findCourseByCourseName("CSE540");
		  assertEquals(course.getCourseName(),"CSE540");
		 }
	 
    
}
