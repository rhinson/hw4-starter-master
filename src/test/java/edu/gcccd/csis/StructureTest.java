package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, Organization they work for, Birthday
 *
 * As for the Organization that the Employee works for, you must also (at the very least) track this information:
 * Organization Name, Number of Employees
 *
 * The system must be able to properly compare any two employees against each other to determine,
 * if they are the same Person. This means that if you compared two People,
 * with the same Name, Birthday, and Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same Organization name are to be thought of as equal,
 * different names means different organizations.
 *
 * This test brought to you by the letters R and H
 * All method creation performed by the great and wonderful IntelliJ IDEA
 */
public class StructureTest {

    // Define 3 instances each of Company and Employee
    Company c1, c2, c3;
    Employee e1, e2, e3;

    @Before
    public void setup(){
        // Pre-Create three companies
        c1 = new Company("Microsoft", 8492);
        c2 = new Company("Intuit", 8200);
        c3 = new Company("ACS", 425);

        // Pre-Create three employees
        e1 = new Employee("Edward Scissorhands", "Gardener", c1, new GregorianCalendar(1972, Calendar.DECEMBER, 25));
        e2 = new Employee("Brad Smith", "CEO", c2, new GregorianCalendar(1965, Calendar.APRIL, 15));
        e3 = new Employee("Roger Hinson","Sr. Technical Architect", c3, new GregorianCalendar(1969, Calendar.JUNE, 16));
    }

    @Test
    public void employeeComplete() {
        // Check that Employee e1's attributes are complete and make sense.
        // assertTrue( employee has a name, company and birthday )
        assertTrue(e1.getName()!=null && e1.getCompany()!=null && e1.getBirthday()!=null);
    }

    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq() {

        // Create new Employee e4 which is a duplicate of Employee e3
        Employee e4 = new Employee("Roger Hinson","Sr. Technical Architect", c3, new GregorianCalendar(1969, Calendar.JUNE, 16));

        // Check that Employee e3 matches the specific criteria for equality with Employee e4
        assertTrue(e3.equals(e4));

        // modify Employee e4 by making him join another company since he enjoys programming
        e4.setCompany(c2);
        assertNotEquals(e3, e4);
    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq() {
        // Create new Company c4 which is a duplicate of Company c3
        Company c4 = new Company("ACS", 425);

        // Check that Company c3 matches the specific criteria for equality with Company c4
        assertTrue(c3.equals(c4));

        // modify company c4 by changing its name
        c4.setName("Applied Computer Solutions");
        assertNotEquals(c3, c4);

    }

    @Test
    public void companyComplete() {
        // Check that Company c1's attributes are complete and make sense.
        // assertTrue( company has a name, and some employees )
        assertTrue(c3.getName()!=null && 0<c3.getName().length());
        assertTrue(0<c3.getNumberOfEmployees());
    }
}