package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {
    Job test_job;
    Job getTest_job;

    @Before
    public void createJobObject() {
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        getTest_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(7,test_job.getId());
        assertEquals(8,getTest_job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assert(test_job.getEmployer() instanceof Employer
                && test_job.getLocation() instanceof Location
                && test_job.getPositionType() instanceof PositionType
                && test_job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job.equals(getTest_job));
    }

    @Test
    public void testJobsForString(){
        assertTrue(test_job.toString(" "));

    }

}
