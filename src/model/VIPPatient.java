package model;

import java.util.Date;

public class VIPPatient extends Patient {
    private String vipType;
    private Date vipTime;

    public VIPPatient(int mumericalOrder, String patientCode, String patientName, String dayIn, String dayOut, String vipType, Date vipTime, String reason) {
        super(mumericalOrder, patientCode, patientName, dayIn, dayOut, reason);
        this.vipType = vipType;
        this.vipTime = vipTime;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public Date getVipTime() {
        return vipTime;
    }

    public void setVipTime(Date vipTime) {
        this.vipTime = vipTime;
    }
}
