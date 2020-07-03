package com.company.Сlasses;

public class Practice extends Classes {

    private int mark;

    public Practice(int mark) {
        this.mark = mark;
    }

    public Practice() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean result() {
        if (mark > 4 && mark <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
