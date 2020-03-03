package org.example;

public class UnderGraduate extends Student {
    public UnderGraduate (String name, String studNum, double loanAmount) {
        super(name, studNum, loanAmount);
    }

    public double getInterest() {
        return super.getLoanAmount() *12 / 100;
    }

}
