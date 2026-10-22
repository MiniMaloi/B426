package com.joysistvi.day5.operators;

public class Activity3_sison {
    public static void main(String[] args) {

        int age = 21;
        int validAge = 18;
        int firstNum = 200;
        int secondNum = 100;
        int score = 67;
        boolean hasValidID = true;
        boolean isWeekend = true;
        boolean isHoliday = true;


        //Task 2 - Event Entry Check
        String isValidEnough = age >= validAge && hasValidID ? "Yes, pwede to tol" : "No, bawal ka d2";

        System.out.println("--- Task 2: Event Entry Check ---");
        System.out.println("Allowed to enter the event? " + isValidEnough);

        //Task 3 - Class Status Check
        String weHaveClass = isWeekend || isHoliday ? "Yes, wala boss" : "No, may class po baby";

        System.out.println("--- Task 3: Class Status Check ---");
        System.out.println("Are there no classes today? " + weHaveClass);

        //Task 4 - Pass or Fail Check
        String gradeInterpret = score >= 75 ? "Passed" : "Failed nak, bawi next time";

        System.out.println("---Task 4 - Pass or Fail Check---");
        System.out.printf("Score: %d %nResult: %s %n", score, gradeInterpret);

        //Task 5 - Large Number Check

        int result = firstNum > secondNum ? firstNum : secondNum;

        System.out.println("---Task 5 - Large Number Check---");
        System.out.printf("Number 1: %d, Number 2: %d %nThe large number is: %d",firstNum, secondNum, result);
    }
}
