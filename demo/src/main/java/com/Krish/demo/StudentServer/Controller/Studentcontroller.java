package com.Krish.demo.StudentServer.Controller;

import com.Krish.demo.StudentServer.Entity.Student;
import com.Krish.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    // here this question mark is called wildcard generic means
    // we don't know which type we are going to send.
    // any type can be sent
    public ResponseEntity<?> storeStudents(@RequestBody List<Student> students) {

        List<Student> result = studentService.studentValidate(students);

        if (result.isEmpty()) {
            return ResponseEntity.badRequest().body("No valid students found.");
        }

        return ResponseEntity.status(201).body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found.");
        }

        return ResponseEntity.ok(student);
    }
    @PutMapping("/{id}")
    public Student updatatedStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    // @patch mapping it is used to edit the specific data.
    @PatchMapping("/{id}")
    public ResponseEntity<?> patchStudent(@PathVariable int id , @RequestBody Map<String , Object>mp){
        Student st = studentService.patchStudent(id,mp);
        if(st == null){
            return ResponseEntity.badRequest().body("student not found");
        }
        return  ResponseEntity.ok(st);
    }
}