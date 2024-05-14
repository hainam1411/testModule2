package model;
public class RegularPatient extends Patient {
    private double fee;

    public RegularPatient(int mumericalOrder, String patientCode, String patientName, String dayIn, String dayOut, double fee, String reason) {
        super(mumericalOrder, patientCode, patientName, dayIn, dayOut, reason);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
