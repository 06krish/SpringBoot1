package com.Krish.demo.StudentServer.Service;

import com.Krish.demo.StudentServer.Entity.Student;
import com.Krish.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Student updateStudent(Integer id , Student existingStudent){
        Optional<Student> stu = studentRepository.findById(id);
        if(stu.isPresent()){
            Student updatedStudent = stu.get();
            updatedStudent.setName(existingStudent.getName());
            updatedStudent.setAge(existingStudent.getAge());
            updatedStudent.setDepartment(existingStudent.getDepartment());
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

    public Student patchStudent(int id , Map<String,Object>updates){
        Optional<Student> stu = studentRepository.findById(id);
        if(stu.isPresent()){
            Student updatedStudent = stu.get();
            if(updates.containsKey("name")){
                updatedStudent.setName((String)updates.get("name"));
            }
            if(updates.containsKey("age")){
                updatedStudent.setAge((Integer)updates.get("age"));
            }
            if(updates.containsKey("department")){
                updatedStudent.setDepartment((String)updates.get("department"));
            }
            return studentRepository.save(updatedStudent);
        }
        return null;
    }
}