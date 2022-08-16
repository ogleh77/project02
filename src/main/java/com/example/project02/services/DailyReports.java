package com.example.project02.services;

public class DailyReports {
    private int reportId;
    private int regstraion;
    private int shortRegist;
    private int male;
    private int female;
    private int vipBox;
    private String date;

    public DailyReports(int regstraion, int shortRegist, int male, int female, int vipBox) {
        this.regstraion = regstraion;
        this.shortRegist = shortRegist;
        this.male = male;
        this.female = female;
        this.vipBox = vipBox;
    }

    public DailyReports(int reportId, int regstraion, int shortRegist, int male, int female, int vipBox, String date) {
        this.reportId = reportId;
        this.regstraion = regstraion;
        this.shortRegist = shortRegist;
        this.male = male;
        this.female = female;
        this.vipBox = vipBox;
        this.date = date;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getRegstraion() {
        return regstraion;
    }

    public void setRegstraion(int regstraion) {
        this.regstraion = regstraion;
    }

    public int getShortRegist() {
        return shortRegist;
    }

    public void setShortRegist(int shortRegist) {
        this.shortRegist = shortRegist;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public int getVipBox() {
        return vipBox;
    }

    public void setVipBox(int vipBox) {
        this.vipBox = vipBox;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DailyReports{" +
                "reportId=" + reportId +
                ", regstraion=" + regstraion +
                ", shortRegist=" + shortRegist +
                ", male=" + male +
                ", female=" + female +
                ", vipBox=" + vipBox +
                '}';
    }
}
