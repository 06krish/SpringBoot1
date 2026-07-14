package com.Krish.demo.StudentServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudnetRepository studentrepository;
    StudentService(StudnetRepository studentrepository){
        this.studentrepository = studentrepository;
    }
    public StudentDet studentvalidate(StudentDet student){
        int id = student.getId();
        int age = student.getAge();
        String name = student.getName();
        String department = student.getDepartment();
        if(id<0 || name == null || age<0 || department == null){
            return null;
        }
        StudnetRepository.save(student);
        return student;
    }

}
