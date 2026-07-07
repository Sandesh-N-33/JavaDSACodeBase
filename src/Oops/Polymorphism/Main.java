package Oops.Polymorphism;

public class Main {
    //Runtime Polymorphism - Dynamic Method Dispatch (Upcasting)
    public static void doDrwaing(Shape s){
        s.draw();
    }


    static void main() {
        //Compile Time Polymorphism - Method Overloading
        Calculator cal = new Calculator();
        cal.add(1, 2, 3);
        cal.add(1, 2.0);
        cal.add(1, 2);
        System.out.println();

        //Runtime Polymorphism - Function Overloading
        Shape s = new Shape();
        Circle c = new Circle();
        Rect r = new Rect();
        s.draw();
        c.draw();
        r.draw();
        System.out.println();

        //Runtime Polymorphism - Dynamic Method Dispatch (Upcasting)
        doDrwaing(c);
        doDrwaing(r);
        doDrwaing(s);
        System.out.println();
    }
}
