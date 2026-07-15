package Oops.Abstraction;

abstract class Bird {
    /**
     * Need To use abstract keyword to make use of abstraction design
     */
    abstract void fly();
    abstract void eat();


    /**
     * Abstract classes can have concrete methods, and these need not be implemented in the subclass
     */
    void drink(){
        System.out.println("Bird Drinking");
    }
}


