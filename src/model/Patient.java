package model;

import java.util.Date;

public class Patient {
    private int mumericalOrder;
    private String patientCode;
    private String patientName;
    private String dayIn;
    private String dayOut;
    private String reason;

    public Patient(int mumericalOrder, String patientCode, String patientName, String dayIn, String dayOut, String reason) {
        this.mumericalOrder = mumericalOrder;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
    }

    public int getMumericalOrder() {
        return mumericalOrder;
    }

    public void setMumericalOrder(int mumericalOrder) {
        this.mumericalOrder = mumericalOrder;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "mumericalOrder=" + mumericalOrder +
                ", patientCode='" + patientCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getData() {
        return mumericalOrder + "," + patientCode + "," + patientName + "," + dayIn + "," + dayOut + "\n";
    }
}
