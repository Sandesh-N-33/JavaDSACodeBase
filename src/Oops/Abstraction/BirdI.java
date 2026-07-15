package Oops.Abstraction;

public interface BirdI {
    void flyI();
    void eatI();


    /**
     * Interfaces can have static,default method implementations
     */
    default void sleepI(){
        System.out.println("Bird sleeping");
    }
}
