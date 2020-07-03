package com.company;

import com.company.Сlasses.Classes;
import com.company.Сlasses.Lab;
import com.company.Сlasses.Practice;
import com.company.Сlasses.Lecture;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");

        Classes classes = new Classes();

        boolean bool = true;
        while(bool = true) {

            System.out.println("1 - Lecture");
            System.out.println("2 - Practice");
            System.out.println("3 - Lab");
            System.out.println("4 - Result");
            System.out.println("5 - Exit");
            System.out.print("Choose: ");

            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("You choose Lecture");
                    Lecture lecture = new Lecture();

                    /*System.out.println("How many visits?");
                    classes.setPresence(in.nextInt());*/

                    System.out.println("% of notes?");
                    lecture.setNotes(in.nextInt());

                    classes.setLectureResult(lecture.result());

                    break;
                case 2:
                    System.out.println("You choose Practice");
                    Practice practice = new Practice();

                    /*System.out.println("How many visits?");
                    classes.setPresence(in.nextInt());*/

                    System.out.println("Mark?");
                    practice.setMark(in.nextInt());

                    classes.setPracticeResult(practice.result());

                    break;
                case 3:
                    System.out.println("You choose Lab");
                    Lab lab = new Lab();

                    /*System.out.println("How many visits?");
                    classes.setPresence(in.nextInt());*/

                    System.out.println("Defense?");
                    lab.setDefense(in.nextInt());

                    System.out.println("Report?)");
                    lab.setReport(in.nextBoolean());


                   classes.setLabResult(lab.result());

                    break;
                case 4:
                    boolean result = classes.result();
                    if (result) {
                        System.out.println("Passed");
                    } else {
                        System.out.println("Not passed");
                    }
                case 5:
                    bool = false;
                    break;
            }
        }

    }
}
