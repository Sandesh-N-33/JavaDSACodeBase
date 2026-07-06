package Oops.Inheritance;

public class Bike extends Vehicle{
    public String handleBarType;
    public String suspensionType;

    public Bike(String name, String model, int noOfTyres, String handleBarType, String suspensionType){
        super(name,model,noOfTyres);
        this.handleBarType = handleBarType;
        this.suspensionType = suspensionType;
    }

    public void doWheelie(){
        System.out.printf("Wheelie done for %s %s",name,model);
        System.out.println();
    }
}
