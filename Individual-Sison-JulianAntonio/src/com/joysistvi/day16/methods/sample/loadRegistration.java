package com.joysistvi.day16.methods.sample;

import java.util.Scanner;

public class loadRegistration {
    static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            dialUSSD();

        }

        public static void dialUSSD() {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            String ussd = input.nextLine();
            if (ussd != "*143#") {
                System.out.println("Invalid UUSD Code, try again");
            }
        }

        public static void mainMenu() {
            System.out.print(   "* Load Registration * \n" +
                    "[1] Go+ \n" +
                    "[2] Go \n" +
                    "[3] GoEXTRA \n" +
                    "[4] UNLI 5G \n" +
                    "[5] ALLNET \n" +
                    "[0] cancel \n" +
                    "Enter a choice: ");
            int promo = input.nextInt();

            switch (promo) {
                case 1 -> goPlusPromo();
                case 2 -> goPromo();
                case 3 -> goExtraPromo();
                case 4 -> unli5GPromo();
                case 5 -> allNetPromo();
                case 0 -> exitMethod();
            }
        }

        public static void goPlusPromo() {
        System.out.print("*** Go+ Promos *** \n" +
                         "[1] Go+99 \n" +
                         "[2] Go+129 \n" +
                         "[3] Go+149 \n" +
                         "Enter a choice: ");
        int goPlus = input.nextInt();

        switch (goPlus) {
            case 1 -> promoDetailsMenu("Go+99",8," with free 8GB","");
            case 2 -> promoDetailsMenu("Go+129",11," with free 8GB","");
            case 3 -> promoDetailsMenu("Go+149",13," with free 8GB","");
            case 0 -> exitMethod();
        }

        }

        public static void goPromo() {
        System.out.print("*** Go Promos *** \n" +
                         "[1] Go50 \n" +
                "[2] Go90 \n" +
                "[3] Go120 \n" +
                " Enter a choice: ");
        int go = input.nextInt();

        switch (go) {
            case 1 -> promoDetailsMenu("Go50",3,"","");
            case 2 -> promoDetailsMenu("Go90",8,"","");
            case 3 -> promoDetailsMenu("Go120",12,"","");
            case 0 -> exitMethod();
        }
        }

        public static void goExtraPromo() {
        System.out.print("*** GoEXTRA Promos *** \n" +
                "[1] GoEXTRA99 \n" +
                "[2] GoEXTRA129 \n" +
                "[3] GoEXTRA149 \n" +
                " Enter a choice: ");
        int goExtra = input.nextInt();

        switch (goExtra) {
            case 1 -> promoDetailsMenu("GoEXTRA99",8," and unli all-net calls and texts","");
            case 2 -> promoDetailsMenu("GoEXTRA129",10," and unli all-net calls and texts","");
            case 3 -> promoDetailsMenu("GoEXTRA149",15," and unli all-net calls and texts","");
        }
        }

        public static void unli5GPromo() {
        System.out.print("*** UNLI 5G Promos ***\n" +
                "[1] UNLI 5G 99 \n" +
                "[2] UNLI 5G 149 \n" +
                "[3] UNLI 5G 199 \n" +
                " Enter a choice: ");
        int unli5G = input.nextInt();

        switch (unli5G) {

            case 1 -> allNetPromo();
            case 2 -> allNetPromo();
            case 3 -> allNetPromo();
        }
        }

        public static void allNetPromo() {
        System.out.print("*** ALLNET Promos ***\n" +
                "[1] ALLNET99 \n" +
                "[2] ALLNET149 \n" +
                "[3] ALLNET199 \n" +
                " Enter a choice: ");
        int allNet = input.nextInt();
        }

        public static void promoDetailsMenu(String promoName, int GB, String free, String noOfDays) {
        System.out.print("*** " + promoName + "Promo ***" +
                         "Get " + GB + "GB for all sites" + free + noOfDays +
                         "[1] Subscribe \n" +
                         "[2] Exit \n" +
                         "Enter a choice: ");
        int action = input.nextInt();
    }

    public static void exitMethod() {
        System.out.println("Are you sure that you want to exit the program?" +
                "\n[Y] Yes - Exit the program" +
                "\n[N] No - Return to Main Menu");
        System.out.print("Enter your choice: ");
        String choice = String.valueOf(input.nextLine().trim().charAt(0));

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting the program...");
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Returning to Main Menu..");
        } else {
            System.out.println("Invalid code, try again");
        }
        }
        public static int getInput(String prompt) {
        while (true) {
            System.out.println(prompt);
            String inputPrompt = input.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }
}
