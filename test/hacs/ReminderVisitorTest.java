package hacs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

/**
 *
 * @author Heli Vachhani
 */

public class ReminderVisitorTest {
    
    public ReminderVisitorTest() {
    }
    
    @Test
	public void testVisitAssignment() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		Assignment assignment = new Assignment();
		assignment.setAssignName("CSE540");
		assignment.setDueDate(new Date());
		reminderVisitor.visitAssignment(assignment);
		assertNotNull(reminderVisitor.getmReminder().listUpcoming);
	}

	@Test
	public void testReminderVisitor() {
		new ReminderVisitor();
	}

	@Test
	public void testReminderVisitorReminder() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		assertNotNull(reminderVisitor.getmReminder());
	}
    
}
