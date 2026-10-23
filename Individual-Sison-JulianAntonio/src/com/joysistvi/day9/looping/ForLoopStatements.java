package com.joysistvi.day9.looping;

public class ForLoopStatements {
    public static void main(String[] args) {
//        int i = 0;
        String[] characters = {
                "Yoshimitsu",
                "Armor King",
                "King",
                "Jin"
        };

        for (int j = 0; j < characters.length; j++){
            System.out.println(characters[j]);
        }

        for (String value : characters){
            System.out.println(value);
        }

//        for (;i < 100;i++){
//            if (i % 2 != 0) continue;
//            System.out.println(i);
//        }
    }
}
