package com.joysistvi.day7.nestedif;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Activity5_Sison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String ussd = scanner.nextLine();

        if (ussd.equals("*143#")){

            System.out.print("* Load Registration * \n" +
                            "[1] Go+ \n" +
                            "[2] Go \n" +
                            "[3] GoEXTRA \n" +
                            "[4] UNLI 5G \n" +
                            "[5] ALLNET \n" +
                            "[6] cancel \n" +
                            "Enter a choice: ");
            int promo = scanner.nextInt();

            switch (promo) {
                case 1:
                    System.out.print("*** Go+ Promos *** \n" +
                            "[1] Go+99 \n" +
                            "[2] Go+129 \n" +
                            "[3] Go+149 \n" +
                            "Enter a choice: ");
                    int goPlus = scanner.nextInt();

                    if (goPlus >= 1 && goPlus <= 3){;
                    switch (goPlus) {
                        case 1:
                            System.out.println("-> Get 8 GB for all sites + 8GB more");
                            break;
                        case 2:
                            System.out.println("-> Get 11 GB for all sites + 8GB more");
                            break;
                        case 3:
                            System.out.println("-> Get 13 GB for all sites + 8GB more");
                            break;
                        }

                        System.out.print(
                                "[1] Subscribe \n" +
                                "[2] Exit \n" +
                                "Exit");
                        int action = scanner.nextInt();

                        if ()
                    } else {

                    }
            }




        } else {

            System.out.println("Invalid USSD Code");
        }
    }
}
