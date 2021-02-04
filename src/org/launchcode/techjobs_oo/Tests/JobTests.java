package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {
    Job job1;
    Job job2;

    @Before
    public void createJobObject() {
        this.job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        this.job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1,job1.getId());
        assertEquals(2,job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assert(job1.getEmployer() instanceof Employer
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
        assertEquals( 1,job1.toString());

    }

}
