package com.company.Сlasses;

public class Classes {

    private String type;
    private int presence;
    private boolean labResult;
    private boolean lectureResult;
    private boolean practiceResult;

    public Classes(){
    }

    public Classes(String type) {
        this.type = type;
    }

    public Classes(int presence) {
        this.presence = presence;
    }

    public Classes(String type, int presence) {
        this.type = type;
        this.presence = presence;
    }

    public void setLabResult(boolean labResult) {
        this.labResult = labResult;
    }

    public void setLectureResult(boolean lectureResult) {
        this.lectureResult = lectureResult;
    }

    public void setPracticeResult(boolean practiceResult) {
        this.practiceResult = practiceResult;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public boolean result(){
        if(labResult && practiceResult && lectureResult){
            return true;
        } else {
            return false;
        }
    }
}
