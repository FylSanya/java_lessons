package com.company.Сlasses;

public class Lecture extends Classes {

    public int notes;

    public Lecture(int notes) {
        this.notes = notes;
    }

    public Lecture() {
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

    public boolean result() {
        if (notes > 50 && notes < 100){
            return true;
        } else {
            return false;
        }
    }
}
