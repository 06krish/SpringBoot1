package com.Krish.demo.StudentServer;

import org.springframework.stereotype.Repository;

// responsible for storing data.
@Repository
public class StudnetRepository {
    public static StudentDet save(StudentDet student){
        System.out.println("saved to database");
        return student;
    }
}
