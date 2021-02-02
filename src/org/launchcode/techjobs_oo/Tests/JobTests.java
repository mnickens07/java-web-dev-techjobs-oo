package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTests {

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job job1 = new Job();
        assertEquals(1,job.getId());
        assertEquals(2,job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assert(job.getEmployer() instanceof Employer
                && job.getLocation() instanceof Location
                && job.getPositionType() instanceof PositionType
                && job.getCoreCompetency() instanceof CoreCompetency);
    }

}
