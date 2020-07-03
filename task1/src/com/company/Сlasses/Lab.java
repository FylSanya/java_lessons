package com.company.Сlasses;

public class Lab extends Classes {

    private boolean report;
    private int defense;

    public Lab(boolean report) {
        this.report = report;
    }

    public Lab() {
    }

    public Lab(int defense) {
        this.defense = defense;
    }

    public Lab(boolean report, int defense) {
        this.report = report;
        this.defense = defense;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean result() {
        if (defense > 4 && defense <= 10 && report) {
            return true;
        } else {
            return false;
        }
    }
}

