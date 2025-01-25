package org.example.service;

import org.example.dao.AllocationDao;
import org.example.dao.HostelDao;
import org.example.dao.RoomDao;
import org.example.dao.StudentDao;
import org.example.model.Allocation;
import org.example.model.Hostel;
import org.example.model.Room;
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
                            System.out.println("HostelId \n" + u.getHostel_id() + "HostelName \n " + u.getHostel_name() + "Number Of Room \n " + u.getNum_of_rooms()));
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
                System.out.print("Enter student_name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student_age: ");
                int age = scanner.nextInt();
                System.out.print("Enter student_department: ");
                String department = scanner.nextLine();

                Student student = new Student();
                student.setName(name);
                student.setAge(age);
                student.setDepartment(department);
                studentService.addStudent(student);

                System.out.println("student added successfully!");
            }

            case 2 -> {

                System.out.print("Enter student ID to delete: ");
                int id = scanner.nextInt();
                studentService.deleteStudent(id);
                System.out.println("student deleted successfully!");

            }
            case 3 -> {
                System.out.print("Enter student ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter new student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student_age: ");
                int age = scanner.nextInt();
                System.out.print("Enter student_department: ");
                String department = scanner.nextLine();

                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setAge(age);
                student.setDepartment(department);
                studentService.updateStudent(student);


                System.out.println("student updated successfully!");
            }
            case 4 -> {
                System.out.println("students in the database:");
                studentService.getAllStudent().forEach(u ->
                        System.out.println("Name\n" + u.getName() + "Age\n "+ + u.getAge() + " Department\n" + u.getDepartment()));
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
                    System.out.print("Enter student_id: ");
                    int student_id = scanner.nextInt();
                    System.out.print("room_id ");
                    int room_id = scanner.nextInt();

                    Allocation allocation = new Allocation();
                    allocation.setRoomId(room_id);
                    allocation.setStudentId(student_id);
                    allocationService.addAllocation(allocation);

                    System.out.println("student added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter allocation ID to delete: ");
                    int id = scanner.nextInt();
                    allocationService.deleteAllocation(id);
                    System.out.println("Allocation deleted successfully!");
                }
                case 3 -> {
                    System.out.println("Allocation in the database:");
                    allocationService.getAllAllocation().forEach(u ->
                            System.out.println("Room ID \n"+u.getRoomId() + " StudentId \n" + u.getStudentId() + "AllocationDate \n " + u.getAllocation_Date()));
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
                    System.out.print("Enter hostelId: ");
                    int hostelId = scanner.nextInt();
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter capacity: ");
                    int capacity = scanner.nextInt();
                    System.out.print("Enter avilable_capacity: ");
                    int avalableCapacity = scanner.nextInt();


                    Room room = new Room();
                    room.setHostelId(hostelId);
                    room.setRoom_num(roomNumber);
                    room.setCapacity(capacity);
                    room.setAvilable_capacity(avalableCapacity);
                    roomService.addRoom(room);

                    System.out.println("student added successfully!");
                }
                case 2 -> {
                    System.out.println("rooms in the database:");
                    roomService.getAllRoom().forEach(u ->
                            System.out.println("HostelID \n"+u.getHostelId() + "Room Number\n " + u.getRoom_num() + "avalable_capacity\n " + u.getAvilable_capacity()+ "Full Capacity \n" + u.getCapacity()));

                }
                case 3 -> {

                    System.out.print("Enter hostel ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter hostelId: ");
                    int hostelId = scanner.nextInt();
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter capacity: ");
                    int capacity = scanner.nextInt();
                    System.out.print("Enter avilable_capacity: ");
                    int avalableCapacity = scanner.nextInt();


                    Room room = new Room();
                    room.setHostelId(hostelId);
                    room.setRoom_num(roomNumber);
                    room.setCapacity(capacity);
                    room.setAvilable_capacity(avalableCapacity);
                    room.setRoom_id(id);
                    roomService.updateRoom(room);

                    System.out.println("student added successfully!");
                }
                case 4 -> {
                    System.out.print("Enter room ID to delete: ");
                    int id = scanner.nextInt();
                    roomService.deleteRoom(id);
                    System.out.println("room deleted successfully!");
                }
                case 0 -> {

                    return false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
