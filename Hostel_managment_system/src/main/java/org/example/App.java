package org.example;

import org.example.dao.StudentDao;
import org.example.model.Student;
import org.example.service.MainService;
import org.example.service.StudentService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        StudentDao studentDao = new StudentDao();
//        StudentService studentService = new StudentService(studentDao);
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to the Health Management Sysytem!");
//        while (true) {
//            System.out.println("\nChoose an option:");
//            System.out.println("1. Add student");
//            System.out.println("2. View All student");
//            System.out.println("3. Update student");
//            System.out.println("4. Delete student");
//            System.out.println("5. Exit");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1 -> {
//                    System.out.print("Enter name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter age: ");
//                    int age = scanner.nextInt();
//
//                    Student student = new Student();
//                    student.setName(name);
//                    student.setAge(age);
//                    studentService.addStudent(student);
//
//                    System.out.println("student added successfully!");
//                }
//                case 2 -> {
//                    System.out.println("students in the database:");
//                    studentService.getAllStudent().forEach(u ->
//                            System.out.println(u.getId() + " " + u.getName() + " " + u.getAge()));
//                }
//                case 3 -> {
//                    System.out.print("Enter student ID to update: ");
//                    int id = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline
//
//                    System.out.print("Enter new name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter new age: ");
//                    int age = scanner.nextInt();
//
//                    Student student = new Student();
//                    student.setId(id);
//                    student.setName(name);
//                    student.setAge(age);
//                    studentService.updateStudent(student);
//
//                    System.out.println("student updated successfully!");
//                }
//                case 4 -> {
//                    System.out.print("Enter user ID to delete: ");
//                    int id = scanner.nextInt();
//                    studentService.deleteStudent(id);
//                    System.out.println("student deleted successfully!");
//                }
//                case 5 -> {
//                    System.out.println("Goodbye!");
//                    scanner.close();
//                    return;
//                }
//                default -> System.out.println("Invalid choice. Try again.");
//            }
//        }


        MainService mainService = new MainService();

        mainService.cliMenuFunction();
    }
}
