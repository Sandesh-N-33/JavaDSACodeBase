package Oops;

import java.sql.SQLOutput;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int noOfSubjects;


    //Default constructor: This doesn't take any attributes from params and sets garbage values
    public Student(){
        System.out.println("Student default ctor called");
    }

    //Behaviours/Methods
    public void study(){
        System.out.println(name+" studying.");
    }
    public void sleep(){
        System.out.println(name+" sleeping.");
    }
    public void bunk(){
        System.out.println(name+" bunking.");
    }
}
