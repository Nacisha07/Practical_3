package org.example;

public class PostGraduate extends Student {
    public PostGraduate (String name, String studNum, double loanAmount) {
        super(name, studNum, loanAmount);
    }

    public double getInterest() {
        return super.getLoanAmount() *10 / 100;
    }
}
