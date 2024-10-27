package oops;

public class Constructor {
public static void main (String[] args){

    // Student amar = new Student();   // Create an instance of the Student class or Creating object
    // amar.cgpa=10.0f;
    
    Student amar = new Student("anand",20,30,"patna",8.15f);   // Call constructor with parameters
    // Student amar = new Student();                    // Calling constructor no parameters
    System.out.println(amar.name);
    System.out.println(amar.age);
    System.out.println(amar.adress);
    System.out.println(amar.usn);
    System.out.println(amar.cgpa);
    System.out.println(amar.isMale);

    Student random = new Student(amar); 
    System.out.println(random.name);



  
}

// creating class in java
static class Student {
    String name;
    int age;
    int usn;
    String adress;              //class prorerties
    float cgpa;
    boolean isMale = true;

    void greetting(){
        System.out.println("Hello"+this.name);
    }

    Student(){                  // default constructor  with no parameter
        this.name = "amar";
        this.age=19;
        this.usn=30;
        this.adress="Bangalore";
        this.cgpa=8.5f;
        this.isMale=true;

        // name = "amar";
        // age=19;
        // usn=30;
        // adress="Bangalore";  if the parameater name and class property have same veriable name that time use this keyword
        // cgpa=8.5f;
        // isMale=true;
    } 


    Student(String name,int age,int usn,String address,float cgpa){ //constructor with some parameter
        this.name = name;
        this.age=age;
        this.usn=usn;
        this.adress=address;
        this.cgpa=cgpa;
    } 

     Student(Student others){ //constructor with class as argument
        this.name = others.name;
        this.age=others.age;
        this.usn=others.usn;
        this.adress=others.adress;
        this.cgpa=others.cgpa;
    }
}
    
}



