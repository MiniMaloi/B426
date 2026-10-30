package com.joysistvi.day12.multidimentionalArray;
import java.util.Scanner;
public class Activity9_Sison { public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "========================================\n"+
                            "           Average Calculator\n"+
                            "========================================\n");

    System.out.print("Please enter the number of students: ");
    int studentsNum = input.nextInt();

    System.out.print("\nPlease enter the number of subject: ");
    int subjectNum = input.nextInt();
    input.nextLine();

    String students[] = new String[studentsNum];
    String subjects[] = new String[subjectNum];
    double [][] grades = new double[studentsNum][subjectNum];

    System.out.println( "____________________________________________"+
                            "\n Enter subjects names: ");

    for (int subCount = 0; subCount < subjectNum; subCount++) {
        System.out.print("Subject " + (subCount + 1) + ": ");
        subjects[subCount] = input.nextLine();
    }

    for (int studCount = 0; studCount < studentsNum; studCount++) {
        System.out.print("\nFull name of student: ");
        students[studCount] = input.nextLine();

        System.out.println("Please enter the grades for each subject: ");

        for (int subCount = 0; subCount < subjectNum; subCount++) {
            System.out.print(subjects[subCount] + ": ");
            grades[studCount][subCount] = input.nextDouble();
        }

        input.nextLine();
    }
        System.out.println( "\n========================================"+
                                "\n              Grades Report"+
                                "\n========================================");

        System.out.printf("%-15s", "Student");

        for (int subCount = 0; subCount < subjectNum; subCount++){
            System.out.printf("%-12s", subjects[subCount]);
        }

        System.out.println("________________Average________________");

        for (int studCount = 0; studCount < studentsNum; studCount++){
            System.out.printf("%-15s", students[studCount]);

            double sum = 0;

            for (int subCount = 0; subCount < subjectNum; subCount++) {
                System.out.printf("%-12.2f", grades [studCount][subCount]);
                sum += grades[studCount][subCount];
            }

            double average = sum / subjectNum;

            System.out.printf("%-12.2f%n", average);

        }

        input.close();

    }
}
