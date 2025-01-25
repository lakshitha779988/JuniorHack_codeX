package org.example.service;

import org.example.model.Student;

import java.util.Scanner;

public class MainService {

    Scanner scanner = new Scanner(System.in);
    public void cliMenuFunction() {


        System.out.println("Welcome to the Health Management Sysytem!");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Manage Hostel");
            System.out.println("2. Manage Student");
            System.out.println("3. Manage Student Allocation");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                        hostelManagementmenu();
                }
                case 2 -> {
                    studentManagementMenue();
                }
                case 3 -> {
                    studentManagementMenue();
                }

                case 0 -> {
                   return;
                }
            }
        }
    }


    public Boolean hostelManagementmenu(){
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Hostel");
            System.out.println("2. Update Hostel Information");
            System.out.println("3. Veiw Hostel Details");
            System.out.println("4. Room Management");
            System.out.println("0. Main Menue");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                   //logic can implemt here
                }
                case 2 -> {
                    //logic can implemt here
                }
                case 3 -> {
                    //logic can implemt here
                }
                case 4 -> {
                    roomManagementMenue();
                }
                case 0 -> {

                    return false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }




public Boolean studentManagementMenue(){
    while (true) {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Update Student ");
        System.out.println("4. View Student Detail");
        System.out.println("0. Main Menue");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                //logic can implemt here
            }
            case 2 -> {
                //logic can implemt here
            }
            case 3 -> {
                //logic can implemt here
            }
            case 4 -> {
                //need to call function to room management
            }
            case 0 -> {

                return false;
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
    }
}

    public Boolean roomAllocationMenue(){
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Allocate Room to Student");
            System.out.println("2. Delete And Allocation ");
            System.out.println("3. Veiw An Allocation ");
            System.out.println("0. Main Menue");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    //logic can implemt here
                }
                case 2 -> {
                    //logic can implemt here
                }
                case 3 -> {
                    //logic can implemt here
                }

                case 0 -> {

                    return false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }


    public Boolean roomManagementMenue(){
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add rooms");
            System.out.println("2. view rooms");
            System.out.println("3. Update rooms ");
            System.out.println("4. delete Rooms");
            System.out.println("0. Back to previous");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    //logic can implemt here
                }
                case 2 -> {
                    //logic can implemt here
                }
                case 3 -> {
                    //logic can implemt here
                }
                case 4 -> {
                    //need to call function to room management
                }
                case 0 -> {

                    return false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
