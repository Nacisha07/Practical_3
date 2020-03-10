package Encapsulation;

public class Student {
    protected int studNum;
    protected String firstName;
    protected String lastName;

    public Student(int studNum, String firstName, String lastName) {
        this.studNum = studNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudNum() {
        return studNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
