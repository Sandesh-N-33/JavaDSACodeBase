import Oops.Person;
import Oops.Student;

public class ClassicalBasic {

    public static void main(String[] args) {
        //This is using default constructor where only the empty object is initialised and the
        //attributes need to be set manually
        Student A = new Student();
        A.name = "Sandesh N";
        A.id = 33;
        A.age = 24;
        A.noOfSubjects = 6;

        A.study();
        A.bunk();
        A.sleep();

        System.out.println();

        //This is using parameterised constructor where the attributes are set using params
        Person B = new Person(33,24,"Sandesh N");

        B.study();
        B.eating();
        B.sleep();

        System.out.println();

        //This is using copy constructor where the attributes of a predefined object are copied to a new object
        Person C = new Person(B);

        C.study();
        C.eating();
        C.sleep();

    }
}
