package com.joysistvi.day13.StringClass;
import java.util.*;
public class MiniActivity_Sison_LoginPage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxAttempt = 0;
        String correctUser = "root";
        String correctPW = "root";
        System.out.println( "=============================================" +
                            "\n             Welcome to Login Page           " +
                            "\n=============================================");
        for (int attempt = 5; attempt > maxAttempt; attempt--){
            System.out.print("username: ");
            String username = input.nextLine();
            System.out.print("password: ");
            String password = input.nextLine();
            if (username.equals(correctUser) && password.equals(correctPW)) {
                System.out.println("Login successfully, Welcome " + username + "!");
                break;
            } else {
                System.out.println("Login unsuccessful:");
                    if (attempt > 1){
                        System.out.println( "You have entered the incorrect credentials, you have " +
                            (attempt - 1) + "attempts left, please try again");
                    } else {
                        System.out.println("You have reached the maximum attempts! \nTerminating program now");
                        break;
                    }
            }
        }
        input.close();
    }
}
