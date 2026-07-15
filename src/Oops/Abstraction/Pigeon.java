package Oops.Abstraction;

public class Pigeon extends Bird implements BirdI{
    /**
     * Abstract Class Method Implementation
     */
    @Override
    void fly(){
        System.out.println("Pigeon flying differently");
    }
    @Override
    void eat(){
        System.out.println("Pigeon eating");
    }


    /**
     * Interface Method Implementation:
     * Need to mention the access modifier as class uses package-private(default) by default and interface, public by default
     */
    @Override
    public void flyI(){
        System.out.println("Pigeon flying differently");
    }
    @Override
    public void eatI(){
        System.out.println("Pigeon eating");
    }
}
