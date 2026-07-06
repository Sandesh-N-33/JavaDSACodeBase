package Oops.Inheritance;

public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name,model,noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc(){
        System.out.printf("AC started for %s %s",name,model);
        System.out.println();
    }
}
