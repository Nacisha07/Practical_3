package Inheritance;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGraduateTest {

    private UnderGraduate underGraduate = new UnderGraduate();

    @Test
    public void getQualication() {
        Assert.assertEquals(underGraduate.getQualication(),"Information Technology");
    }

    @Test
    public void getFee() {
        Assert.assertSame(underGraduate.getFee(),21000.0);
    }

    @Test
    public void setQualication() {
        String testQualification = "Information Technology";
        underGraduate.setQualication(testQualification);
        assertEquals(testQualification, testQualification);
    }

    @Test
    public void setFee() {
        double testFee = 21000.0;
        underGraduate.setFee(testFee);
        assertSame(testFee, testFee);
    }
}