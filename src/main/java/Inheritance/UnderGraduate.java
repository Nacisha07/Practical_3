package Inheritance;

import Encapsulation.Student;

public class UnderGraduate extends Student {

    protected  String qualication;
    protected double fee;

    public UnderGraduate(int studNum, String firstName, String lastName, String qualification, double fee) {
        super(studNum, firstName, lastName);
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
}
