package Encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    protected Student student = new Student();

    @Test
    public void getStudNum() {
        Assert.assertEquals(student.getStudNum(),215741);
    }

    @Test
    public void getFirstName() {
        Assert.assertEquals(student.getFirstName(), "Nacisha");
    }

    @Test
    public void getLastName() {
        Assert.assertEquals(student.getLastName(), "Jaftha");
    }

    @Test
    public void getLoanAmount() {
        Assert.assertSame(student.getLoanAmount(), 15000.0);
    }

    @Test
    public void setStudNum() {
        int testStudNum = 215741;
        student.setStudNum(testStudNum);
        assertEquals(testStudNum, testStudNum);
    }

    @Test
    public void setFirstName() {
        String testFirstName = "Nacisha";
        student.setFirstName(testFirstName);
        assertEquals(testFirstName, testFirstName);
    }

    @Test
    public void setLastName() {
        String testLastName = "Jaftha";
        student.setLastName(testLastName);
        assertEquals(testLastName, testLastName);
    }

    @Test
    public void setLoanAmount() {
        double testLoanAmount = 15000.0;
        student.setLoanAmount(testLoanAmount);
        assertEquals(testLoanAmount, testLoanAmount);
    }
}