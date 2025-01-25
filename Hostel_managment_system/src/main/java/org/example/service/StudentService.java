package org.example.service;

import org.example.dao.StudentDao;
import org.example.model.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student){
        studentDao.updateStudents(student);
    }


    public List<Student> getAllStudent(){
       return studentDao.getAllStudents();
    }

    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }
}
