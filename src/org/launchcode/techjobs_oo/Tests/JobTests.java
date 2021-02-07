package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.main.*;

import static org.junit.Assert.*;


public class JobTests {
    private Job job1;
    private Job job2;
    private Job job3;

    @Before
    public void createJobObjects() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("Boeing"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job3 = new Job("Ice cream taster", new Employer("ACME"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

    }

    @Test
    public void testSettingJobId(){
        assertEquals(10, job1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(job1.getEmployer() instanceof Employer
                && job1.getLocation() instanceof Location
                && job1.getPositionType() instanceof PositionType
                && job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testJobsForString(){
//        ID:  _______
//        Name: _______
//        Employer: _______
//        Location: _______
//        Position Type: _______
//        Core Competency: _______
//                this.job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals( "\nID: 4\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence"+"\n", job1.toString());
    }

}
