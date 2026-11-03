package com.joysistvi.day16.methods.sample;

import java.util.Scanner;

public class loadRegistration {
    static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {

            dialUSSD();

        }

    public static void dialUSSD() {

        String ussd;

        do {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            ussd = input.nextLine();

            if (!ussd.equals("*143#")) {
                System.out.println("Incorrect USSD Code, please try again\n");
            }

        } while (!ussd.equals("*143#"));
        mainMenu();

    }

        public static void mainMenu() {
            while (true) {
                System.out.print("\n* Load Registration * \n" +
                        "[1] Go+ \n" +
                        "[2] Go \n" +
                        "[3] GoEXTRA \n" +
                        "[4] UNLI 5G \n" +
                        "[5] ALLNET \n" +
                        "[0] cancel \n" +
                        "Enter a choice: ");
                int promo = getInput("Enter a choice: ");

                switch (promo) {
                    case 1 -> goPlusPromo();
                    case 2 -> goPromo();
                    case 3 -> goExtraPromo();
                    case 4 -> unli5GPromo();
                    case 5 -> allNetPromo();
                    case 0 -> exitMethod();
                }
            }
        }

        public static void goPlusPromo() {
            while (true) {
                System.out.print("*** Go+ Promos *** \n" +
                        "[1] Go+99 \n" +
                        "[2] Go+129 \n" +
                        "[3] Go+149 \n" +
                        "[4] Back \n" +
                        "[0] Cancel \n");
                int goPlus = getInput("Enter a choice: ");

                switch (goPlus) {
                    case 1 -> promoDetailsMenu("Go+99", 8, " with free 8GB", "");
                    case 2 -> promoDetailsMenu("Go+129", 11, " with free 8GB", "");
                    case 3 -> promoDetailsMenu("Go+149", 13, " with free 8GB", "");
                    case 4 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }

            }
        }

        public static void goPromo() {
            while (true) {
                System.out.print("*** Go Promos *** \n" +
                        "[1] Go50 \n" +
                        "[2] Go90 \n" +
                        "[3] Go120 \n" +
                        "[4] Back \n" +
                        "[0] Cancel \n");
                int go = getInput("Enter a choice: ");

                switch (go) {
                    case 1 -> promoDetailsMenu("Go50", 3, "", "");
                    case 2 -> promoDetailsMenu("Go90", 8, "", "");
                    case 3 -> promoDetailsMenu("Go120", 12, "", "");
                    case 4 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }
            }
        }

        public static void goExtraPromo() {
            while (true) {
                System.out.print("*** GoEXTRA Promos *** \n" +
                        "[1] GoEXTRA99 \n" +
                        "[2] GoEXTRA129 \n" +
                        "[3] GoEXTRA149 \n" +
                        "[4] Back \n" +
                        "[0] Cancel \n");
                int goExtra = getInput("Enter a choice: ");

                switch (goExtra) {
                    case 1 -> promoDetailsMenu("GoEXTRA99", 8, " and unli all-net calls and texts", "");
                    case 2 -> promoDetailsMenu("GoEXTRA129", 10, " and unli all-net calls and texts", "");
                    case 3 -> promoDetailsMenu("GoEXTRA149", 15, " and unli all-net calls and texts", "");
                    case 4 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }
            }
        }

        public static void unli5GPromo() {
            while (true) {
                System.out.print("*** UNLI 5G Promos ***\n" +
                        "[1] UNLI 5G 99 \n" +
                        "[2] UNLI 5G 149 \n" +
                        "[3] UNLI 5G 199 \n" +
                        "[4] Back \n" +
                        "[0] Cancel \n");
                int unli5G = getInput("Enter a choice: ");

                switch (unli5G) {

                    case 1 -> promoDetailsMenu("UNLI 5G 99", 100, "", "for 1 day");
                    case 2 -> promoDetailsMenu("UNLI 5G 149", 100, "", "for 3 day");
                    case 3 -> promoDetailsMenu("UNLI 5G 199", 100, "", "for 7 day");
                    case 4 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }
            }
        }

        public static void allNetPromo() {
            while (true) {
                System.out.print("*** ALLNET Promos ***\n" +
                        "[1] ALLNET99 \n" +
                        "[2] ALLNET149 \n" +
                        "[3] ALLNET199 \n" +
                        "[4] Back \n" +
                        "[0] Cancel \n");
                int allNet = getInput("Enter a choice: ");

                switch (allNet) {
                    case 1 -> promoDetailsMenu("ALLNET99", 1, "and unli calls and texts to all networks", "for 3 days");
                    case 2 ->
                            promoDetailsMenu("ALLNET149", 2, "and unli calls and texts to all networks", "for 7 days");
                    case 3 ->
                            promoDetailsMenu("ALLNET199", 3, "and unli calls and texts to all networks", "for 14 days");
                    case 4 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }
            }
        }

        public static void promoDetailsMenu(String promoName, int GB, String free, String noOfDays) {
            while (true) {
                System.out.print("*** " + promoName + "Promo ***\n" +
                        "Get " + GB + "GB for all sites" + free + noOfDays +
                        "\n[1] Subscribe \n" +
                        "[2] Exit \n" +
                        "[3] Back \n" +
                        "[0] Cancel \n");
                int action = getInput("Enter a choice: ");

                switch (action) {

                    case 1 -> actions();
                    case 2 -> exitMethod();
                    case 3 -> {
                        return;
                    }
                    case 0 -> exitMethod();
                }

            }
        }

    public static void actions(){
        System.out.println("*** Load Registration Successful ***");
        System.out.println("    Thank you for choosing Globe    ");
    }

    public static void exitMethod() {
        System.out.println("Are you sure that you want to exit the program?" +
                "\n[1] Yes - Exit the program" +
                "\n[2] No - Return to Main Menu");
        System.out.print("Enter your choice: ");
        String choice = String.valueOf(input.nextLine().trim().charAt(0));

        if (choice.equalsIgnoreCase("1")) {
            System.out.println("Exiting the program...");
        } else if (choice.equalsIgnoreCase("2")) {
            System.out.println("Returning to Main Menu..");
        } else {
            System.out.println("Invalid code, try again");
        }
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String inputPrompt = input.nextLine().trim();

            try {
                return Integer.parseInt(inputPrompt);
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number");
            }
        }
    }
}
