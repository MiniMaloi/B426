package com.joysistvi.day20.encapsulation.activity13_Sison;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        UserAccounts account = new UserAccounts();
        boolean validEmail;
        boolean validPassword;

        System.out.print( "*****************************************\n" +
                "       User Account Registration         \n" +
                "*****************************************\n");


        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your Middle Name: ");
        String middleName = input.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your Address: ");
        String address = input.nextLine();


        do {
            System.out.print("Enter your Email: ");
            String email = input.nextLine();
            validEmail = account.setEmail(email);
        } while (!validEmail);

        do {
            System.out.print("Enter your Password: ");
            String password = input.nextLine();
            validPassword = account.setPassword(password);
        } while (!validPassword);


        account.setFirstName(firstName);
        account.setMiddleName(middleName);
        account.setLastName(lastName);
        account.setAddress(address);


        System.out.println("\n****** User Account Created ************");
        System.out.println( "Full name: " + account.getFirstName() + " " +
                account.getMiddleName() + " " + account.getLastName());
        System.out.println( "Address: " + account.getAddress());
        System.out.println( "Email: " + account.getEmail());


        input.close();
    }
}



