package Oops.Inheritance;

public class Vehicle {

    protected String name;
    protected String model;
    protected int noOfTyres;

    protected Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    protected void start_engine(){
        System.out.printf("Engine started for %s - %s",name,model);
        System.out.println();
    }

    protected void stop_engine(){
        System.out.printf("Engine stopped for %s - %s",name,model);
        System.out.println();
    }
}
