package oop_lecture;

import java.util.Scanner;

public class OopLecture {

    public static void main(String[] args) {

        //We've seen some OOP before:
        System.out.println("Math.PI = " + Math.PI);

        Scanner myScannerObject = new Scanner(System.in);

        Student firstStudent = new Student("David", "Renteria", "Azeban");

        System.out.println(firstStudent.rollCall());

        Student pretendStudent = new Student("Johnny", "Doe", "ExCohort", 88);

        System.out.println("pretendStudent.grade = " + pretendStudent.grade);
    }
}
