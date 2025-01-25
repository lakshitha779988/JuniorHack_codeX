package org.example.service;

import org.example.dao.AllocationDao;
import org.example.dao.HostelDao;
import org.example.dao.RoomDao;
import org.example.dao.StudentDao;
import org.example.model.Hostel;
import org.example.model.Student;

import java.util.Scanner;

public class MainService {

    StudentDao studentDao = new StudentDao();
    RoomDao roomDao = new RoomDao();
    HostelDao hostelDao = new HostelDao();
    AllocationDao allocationDao = new AllocationDao();


    StudentService studentService = new StudentService(studentDao);
    RoomService roomService = new RoomService(roomDao);
    HostelService hostelService = new HostelService(hostelDao);
    AllocationService allocationService = new AllocationService(allocationDao);

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
                    System.out.print("Enter hostel_name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number of rooms: ");
                    int num_of_room = scanner.nextInt();

                    Hostel hostel = new Hostel();
                    hostel.setHostel_name(name);
                    hostel.setNum_of_rooms(num_of_room);
                    hostelService.addHostel(hostel);

                    System.out.println("student added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter hostel ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter new hostel Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new number of rooms: ");
                    int num_of_rooms = scanner.nextInt();

                    Hostel hostel = new Hostel();
                    hostel.setHostel_id(id);
                    hostel.setHostel_name(name);
                    hostel.setNum_of_rooms(num_of_rooms);
                    hostelService.updateHostel(hostel);

                    System.out.println("student updated successfully!");
                }
                case 3 -> {
                    System.out.println("students in the database:");
                    hostelService.getAllHostel().forEach(u ->
                            System.out.println(u.getHostel_id() + " " + u.getHostel_name() + " " + u.getNum_of_rooms()));
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
