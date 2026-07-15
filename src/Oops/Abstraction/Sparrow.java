package Oops.Abstraction;

public class Sparrow extends Bird implements BirdI{
    /**
     * Abstract Class Method Implementation
     */
    @Override
    void fly(){
        System.out.println("Sparrow flying");
    }
    @Override
    void eat(){
        System.out.println("Sparrow eating");
    }


    /**
     * Interface Method Implementation:
     * Need to mention the access modifier as class uses package-private(default) by default and interface, public by default
     */
    @Override
    public void flyI(){
        System.out.println("Sparrow flying differently");
    }
    @Override
    public void eatI(){
        System.out.println("Sparrow eating");
    }
}
