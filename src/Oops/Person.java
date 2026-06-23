package Oops;

public class Person {
    //Attributes
    public int id;
    public int age;
    public String name;


    // parameterised constructor: The attributes are set using params and the attributes are accessed
    // inside the constructor using "this.attributeName"
    public Person(int id, int age, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
        System.out.println("Person parameterised ctor called");
    }

    // parameterised constructor: The attributes are set using params and the attributes are accessed
    // inside the constructor using "this.attributeName"
    public Person(Person obj) {
        this.age = obj.age;
        this.id = obj.id;
        this.name = obj.name;
        System.out.println("Person copy ctor called");
    }

    //Behaviours/Methods
    public void study() {
        System.out.println(name + " studying.");
    }

    public void sleep() {
        System.out.println(name + " sleeping.");
    }

    public void eating() {
        System.out.println(name + " eating.");
    }
}
