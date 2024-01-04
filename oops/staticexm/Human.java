package oops.staticexm;

public class Human {
    String name;
    int age;
    boolean ismarride;
    static long population;

    static void message(){
        // System.out.println("This is a human"+this.age);  Cannot use this in a static context
    }

    void greeting(){
        System.out.println("This is a human name is :"+this.name);  //Can use this in a public context
    }


    public Human(String Name,int age,boolean ismarride){
        this.name=Name;
        this.age=age;
        this.ismarride=ismarride;
        Human.population += 1;
    }
    
}
