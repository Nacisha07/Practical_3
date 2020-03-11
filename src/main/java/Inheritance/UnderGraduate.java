package Inheritance;

import Encapsulation.Student;

public class UnderGraduate extends Student {

    protected  String qualication;
    protected double fee;

    public UnderGraduate(int studNum, String firstName, String lastName, double loanAmount, String qualification, double fee) {
        super(studNum, firstName, lastName, loanAmount);
        this.qualication = qualification;
        this.fee = fee;
    }

    public String getQualication() {

        return qualication;
    }

    public double getFee() {

        return fee;
    }

    public void setQualication(String qualication) {

        this.qualication = qualication;
    }

    public void setFee(double fee) {

        this.fee = fee;
    }

    @Override
    public double getInterest() {
        return super.getLoanAmount() * 12 / 100;
    }
}
