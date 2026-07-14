//package com.Krish.demo.StudentServer;
//
//import com.Krish.demo.Student;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//// service responsible for business logics
//@RestController
//public class StudentServer {
//
//    //1. Store Student Data in Student Class
//    // @PostMapping("/create")
//    // public String storeStudent(){
//    //     return """
//    //             id : 1,
//    //             name : Krish,
//    //             Department: CSE,
//    //             age : 21
//    //             """;
//    // }
//
//    /*We are using @RequestBody annotation to map the request body to a Student object
//    and sending data through Postman in JSON format. The Student object is then converted
//    to a string using the toString() method and returned as the response.
//    */
//    @PostMapping("/create")
//    public String storeStudent(@RequestBody StudentDet student){
//        return student.toString();
//    }
//
//    //2. Read Student data with ID
//    // @GetMapping("/read")
//
//
//    //3. update the Student information
//
//    ///4. Delete the Student information
//}