package com.Krish.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    String name;
    int age;
    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setage(int age){
        this.age = age;
    }
    public void  getage(){
       System.out.println(age);
    }

    public void setname(String name){
        this.name = name;
    }
    public void getname(){
        System.out.println(name);
    }

}
