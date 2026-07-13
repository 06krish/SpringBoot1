package com.Krish.demo;
class p{
    void m1(){

    }
    void m2(){

    }
}
class c1 extends p{
    void m3(){

    }
}
public class Test {
    c1 c1 = new c1();
    // cant hold parent reference in the child class.
    // c1 c2 = new p(); will give error
}
