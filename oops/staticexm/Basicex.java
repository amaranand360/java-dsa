package oops.staticexm;

public class Basicex {
    public static void main(String[] args) {

        // greetting()  //we Cannot make a static reference to the non-static method greetting() its does not depand on intances
        // Basicex obj = new Basicex(); // Create an instance of the outer class
        // obj.greetting();  //i can use like this by refrencing it
        
        // Student anand = new Student(); //we can not use this because its require intance(inside static we can't use non-static without creating instance)


        Basicex obj = new Basicex(); // Create an instance of the outer class
        Student amar = obj.new Student(); // Create an instance of the nested class
        amar.name = "Amar";
        System.out.println(amar.name);
    }


    //non-static function
    //we also know something which ios not static ,belong to an object
     void greetting(){
        System.out.println("Hello");
        Student anand = new Student(); //we can use this because its not require intance (non-static)
        anand.name = "AMAR";
        System.out.println(anand.name);

    }
    // Creating a non-static nested class in java
    class Student {
        // Class properties
        String name;
        int age;
        int usn;
        String address;
        float cgpa;
        boolean isMale;

    }
}
