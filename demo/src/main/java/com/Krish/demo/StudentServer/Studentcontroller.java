package com.Krish.demo.StudentServer;
// responsible for handling http request

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
    StudentService studentservice;
    @Autowired
    Studentcontroller(StudentService studentservice){
        this.studentservice = studentservice;
    }
    @PostMapping("/create")
    public ResponseEntity<StudentDet> storeStudent(@RequestBody StudentDet student){
       StudentDet result = studentservice.studentvalidate(student);
       if(result == null){
           return ResponseEntity.status(400).body(null);
       }
       return ResponseEntity.status(201).body(result);

    }
}
