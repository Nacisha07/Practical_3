package org.example;

public abstract class Student implements LoanInterest {
    private String name;
    private String studNum;
    private double loanAmount;

    public Student(String name, String studNum, double loanAmount) {
        this.name = name;
        this.studNum = studNum;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public String getStudNum() {
        return studNum;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
