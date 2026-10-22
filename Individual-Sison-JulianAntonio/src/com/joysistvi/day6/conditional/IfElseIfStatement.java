package com.joysistvi.day6.conditional;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int day = 4;
        double grade = 9645;
        String result = "";

        if (grade < 100 && grade < 1){
            result = "Invalid pooo nig";
        } else if (grade >= 90) {
            result = "A";
        } else if (grade >= 80) {
            result = "B";
        } else if (grade >= 70) {
            result = "C";
        } else if (grade >= 60) {
            result = "D";
        } else {
            result = "F"; }

        System.out.println("My Grade is: " + result);
        /*String result = "";

        //executes when day is n
        if (day == 1){
            result = "Sunday";
        } else if (day == 2) {
            result = "Monday";
        } else if (day == 3){
            result = "Tuesday";
        } else if (day == 4){
            result = "Wednesday";
        } else if (day == 5){
            result = "Thursday";
        } else if (day == 6){
            result = "Friday";
        } else if (day == 7){
            result = "Saturday";
        } else {
            result = "Invalid Day";
        }
        System.out.println("Today is: " + result);*/
    }

}
