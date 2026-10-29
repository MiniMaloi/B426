package com.joysistvi.day7.nestedif;
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

                    if (goPlus >= 1 || goPlus <= 3){
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
                                    "Enter a choice: ");
                            int action = scanner.nextInt();

                            if (action == 1) {
                                if (goPlus == 1) {
                                    System.out.println("You are now subscribed to Go+99");
                                } else if (goPlus == 2) {
                                    System.out.println("You are now subscribed to Go+129");
                                } else {
                                    System.out.println("You are now subscribed to Go+149");
                                }
                            } else if (goPlus == 2) {
                                System.out.println("Transaction Cancelled");
                            } else {
                                System.out.println("Invalid Choice");
                            }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 2:
                    System.out.print("*** Go Promos *** \n" +
                                    "[1] Go50 \n" +
                                    "[2] Go90 \n" +
                                    "[3] Go120 \n" +
                                    " Enter a choice: ");
                    int go = scanner.nextInt();

                    if (go >= 1 || go <= 3){
                        switch (go) {
                            case 1:
                                System.out.println("-> Get 3 GB for all sites");
                                break;
                            case 2:
                                System.out.println("-> Get 7 GB for all sites");
                                break;
                            case 3:
                                System.out.println("-> Get 12 GB for all sites");
                                break;
                        }

                        System.out.print(
                                        "[1] Subscribe \n" +
                                        "[2] Exit \n" +
                                        "Enter a choice: ");
                        int actionGo = scanner.nextInt();

                        if (actionGo == 1) {
                            if (go == 1) {
                                System.out.println("You are now subscribed to Go50");
                            } else if (go == 2) {
                                System.out.println("You are now subscribed to Go90");
                            } else {
                                System.out.println("You are now subscribed to Go120");
                            }
                        } else if (go == 2) {
                            System.out.println("Transaction Cancelled");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Choice");
            }
                    break;
                case 3:
                    System.out.print("*** GoEXTRA Promos *** \n" +
                            "[1] GoEXTRA99 \n" +
                            "[2] GoEXTRA129 \n" +
                            "[3] GoEXTRA149 \n" +
                            " Enter a choice: ");
                    int goExtra = scanner.nextInt();

                    if (goExtra >= 1 || goExtra <= 3){
                        switch (goExtra) {
                            case 1:
                                System.out.println("-> 8 GB all-access data + unli all-net calls and texts");
                                break;
                            case 2:
                                System.out.println("-> 10 GB all-access data + unli all-net calls and texts");
                                break;
                            case 3:
                                System.out.println("-> 5 GB all-access data + unli all-net calls and texts");
                                break;
                        }

                        System.out.print(
                                        "[1] Subscribe \n" +
                                        "[2] Exit \n" +
                                        "Enter a choice: ");
                        int actionGoExtra = scanner.nextInt();

                        if (actionGoExtra == 1) {
                            if (goExtra == 1) {
                                System.out.println("You are now subscribed to GoEXTRA99");
                            } else if (goExtra == 2) {
                                System.out.println("You are now subscribed to GoEXTRA129");
                            } else {
                                System.out.println("You are now subscribed to GoEXTRA149");
                            }
                        } else if (actionGoExtra == 2) {
                            System.out.println("Transaction Cancelled");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 4:
                    System.out.print("*** UNLI 5G Promos ***\n" +
                            "[1] UNLI 5G 99 \n" +
                            "[2] UNLI 5G 149 \n" +
                            "[3] UNLI 5G 199 \n" +
                            " Enter a choice: ");
                    int unli5G = scanner.nextInt();

                    if (unli5G >= 1 || unli5G <= 3){
                        switch (unli5G) {
                            case 1:
                                System.out.println("-> Unli 5G for 1 day");
                                break;
                            case 2:
                                System.out.println("-> Unli 5G for 3 day");
                                break;
                            case 3:
                                System.out.println("-> Unli 5G for 7 days");
                                break;
                        }

                        System.out.print(
                                        "[1] Subscribe \n" +
                                        "[2] Exit \n" +
                                        "Enter a choice: ");
                        int actionUnli = scanner.nextInt();

                        if (actionUnli == 1) {
                            if (unli5G == 1) {
                                System.out.println("You are now subscribed to UNLI 5G 99");
                            } else if (unli5G == 2) {
                                System.out.println("You are now subscribed to UNLI 5G 149");
                            } else {
                                System.out.println("You are now subscribed to UNLI 5G 199");
                            }
                        } else if (actionUnli == 2) {
                            System.out.println("Transaction Cancelled");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                         break;
                case 5:
                    System.out.print("*** ALLNET Promos ***\n" +
                            "[1] ALLNET99 \n" +
                            "[2] ALLNET149 \n" +
                            "[3] ALLNET199 \n" +
                            " Enter a choice: ");
                    int allNet = scanner.nextInt();

                    if (allNet >= 1 || allNet <= 3){
                        switch (allNet) {
                            case 1:
                                System.out.println("-> Unli calls and texts to all networks + 1 GB of mobile data");
                                break;
                            case 2:
                                System.out.println("-> Unli calls and texts to all networks + 2 GB of mobile data");
                                break;
                            case 3:
                                System.out.println("-> Unli calls and texts to all networks + 3 GB of mobile data");
                                break;
                        }

                        System.out.print(
                                        "[1] Subscribe \n" +
                                        "[2] Exit \n" +
                                        "Enter a choice: ");
                        int actionAllNet = scanner.nextInt();

                        if (actionAllNet == 1) {
                            if (allNet == 1) {
                                System.out.println("You are now subscribed to ALLNET 99");
                            } else if (allNet == 2) {
                                System.out.println("You are now subscribed to ALLNET 149");
                            } else {
                                System.out.println("You are now subscribed to ALLNET 199");
                            }
                        } else if (actionAllNet == 2) {
                            System.out.println("Transaction Cancelled");
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                        break;
            }
        } else {
            System.out.println("Invalid USSD Code");}
    }
}
