package Encapsulation;

import Polymorphism.LoanInterest;

public abstract class Student implements LoanInterest {
    protected int studNum;
    protected String firstName;
    protected String lastName;
    protected double loanAmount;

    public Student(int studNum, String firstName, String lastName, double loanAmount) {
        this.studNum = studNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
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

    public double getLoanAmount() {
        return loanAmount;
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

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

}
