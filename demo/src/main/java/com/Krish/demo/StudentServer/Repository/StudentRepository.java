package com.Krish.demo.StudentServer.Repository;

import com.Krish.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
