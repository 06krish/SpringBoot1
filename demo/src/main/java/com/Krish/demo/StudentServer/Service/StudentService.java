package com.Krish.demo.StudentServer.Service;

import com.Krish.demo.StudentServer.Entity.Student;
import com.Krish.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> studentValidate(List<Student> students) {

        List<Student> validStudents = new ArrayList<>();

        for (Student student : students) {

            if (student.getId() <= 0
                    || student.getName() == null || student.getName().trim().isEmpty()
                    || student.getAge() <= 0
                    || student.getDepartment() == null || student.getDepartment().trim().isEmpty()) {

                continue;   // Skip invalid student
            }

            validStudents.add(student);
        }

        return studentRepository.saveAll(validStudents);
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
}