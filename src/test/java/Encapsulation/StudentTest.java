package Encapsulation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student();

        student.setStudNum(215741);
        student.setFirstName("Nacisha");
        student.setLastName("Jaftha");
    }

    @After
    public void tearDown() throws Exception {
    }

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
    public void setStudNum() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void setLastName() {
    }
}