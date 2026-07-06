package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tata","Indigo",4,4,"Manual");
        c.start_engine();
        c.startAc();
        c.stop_engine();

        Bike b = new Bike("Royal Enfield","Meteor 350", 2,"Std Cruiser","Dual");
        b.start_engine();
        b.doWheelie();
        b.stop_engine();
    }
}
