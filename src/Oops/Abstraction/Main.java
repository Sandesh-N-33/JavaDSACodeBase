package Oops.Abstraction;

public class Main {
    public static void main(String[] args) {

        /* ABSTRACT CLASSES */
        Bird b = new Sparrow();
        b.fly();
        b.eat();
        b.drink();
        System.out.println();

        b = new Pigeon();
        b.fly();
        b.eat();
        b.drink();
        System.out.println();

        /* INTERFACE */
        BirdI c = new Sparrow();
        c.flyI();
        c.eatI();
        c.sleepI();
        System.out.println();

        c = new Pigeon();
        c.flyI();
        c.eatI();
        c.sleepI();
        System.out.println();

    }
}
