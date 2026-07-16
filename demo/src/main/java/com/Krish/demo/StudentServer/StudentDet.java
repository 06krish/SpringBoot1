package com.Krish.demo.StudentServer;

import jakarta.persistence.*;
@Entity
@Table(name = "student")
public class StudentDet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    int age;
    public StudentDet(){}
    StudentDet(Integer id,String name,int age){
        this.id = id;
        this.name = name;
        this.age= age;
    }
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;

    public void setID(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
}
