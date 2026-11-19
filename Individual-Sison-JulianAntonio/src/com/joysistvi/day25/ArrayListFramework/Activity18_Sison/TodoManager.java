package com.joysistvi.day25.ArrayListFramework.Activity18_Sison;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager  {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void showMenu() {
        System.out.println( "\n--- Todo Manager Menu ---" +
                            "\n1. Add a task" +
                            "\n2. View all tasks" +
                            "\n3. Update a task" +
                            "\n4. Remove a task" +
                            "\n5. Clear all tasks" +
                            "\n0. Exit\n");
    }

    public static void addTask() {
        System.out.print(   "\nAdd Tasks" +
                            "\nEnter your task: ");
        String task = scanner.nextLine().trim();

        if (task.isEmpty()) {
            System.out.println("Task cannot be empty.");
            return;
        }

        tasks.add(task);

        System.out.println( "===========================" +
                            "\n   Task added successfully!  " +
                            "\n===========================");
    }

    public static void viewTasks() {

        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void updateTask() {

        System.out.println("Update Tasks" + "\nCurrent Tasks are:\n");

        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to update: \n");


        if (taskNumber >= 1 && taskNumber <= tasks.size()) {

            System.out.print("Enter your updated task: ");

            String updatedTasks = scanner.nextLine().trim();

            if (updatedTasks.isEmpty()) {
                System.out.println("Updated task cannot be empty.");
                return;
            }
            tasks.set(taskNumber - 1, updatedTasks);

            System.out.println( "\nTask updated successfully!" +
                                "\nYour new tasks are: ");
            viewTasks();

        } else {
            System.out.println("\nInvalid task number.");
        }

    }

    public static void clearTasks() {
        tasks.clear();
        System.out.println("\nAll tasks cleared successfully!\n");
    }

    public static void removeTask() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }

        viewTasks();

        int taskNumber = getInput("Enter task number to remove: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {

            tasks.remove(taskNumber - 1);

            System.out.println( "\nTask removed successfully!" +
                                "\nYour new tasks are: ");
            viewTasks();

        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMenu();

            int choice = getInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    updateTask();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                        break;
                    }

                    System.out.print( "Are you sure you want to delete all tasks? " +
                                        "\n1. Yes" +
                                        "\n2. No\n");
                    int action = getInput("Enter your choice: ");

                    switch (action) {
                        case 1:
                            clearTasks();
                            break;

                        case 2:
                            System.out.println("Returning to Main Menu...");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 0:
                    System.out.println("\n           Exiting TodoManager. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }


}

