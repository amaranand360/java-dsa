package oops.Inhiretance;

public class Boxweight extends Box { //Boxweight is inherite the Box class 
    double weight;
    
    Boxweight(){
        this.weight = -1;
    }
    Boxweight(double l,double b, double h,double weight){
            super(l,b,h); //call the parent class constructor
            this.weight=weight; //child class use the parent class property
            // System.out.println(super.weight); it directly goes to parent class and return that class value.
            
            // super(l,b,h); //Constructor call must be the first statement in a constructor
        }
    Boxweight(Boxweight others){
        super(others);
        weight = others.weight;
    }
    
    public void displayInfo() {
        info();
    }

    public static void main(String[] args) {
        // Box box0 = new Box();
        // Box box1 = new Box(5); //depeand on arguments which constructor is clalled.
        // Box box3 = new Box(3,4,5);
        // Box box4 = new Box(box3);

        Boxweight box2 = new Boxweight(50, 30, 40, 96);
        System.out.println("weight  & height of box is: " + box2.weight +", " + box2.height);

        Box boxobj = new Boxweight(2, 3, 4, 10); //the parent class can be call by the child class .
        // System.out.println(boxobj.weight); //you are trying to access child class property by parent class.
        System.out.println(boxobj.height);  //you can use the property of only parent class not child class.
   
        // Boxweight newobj = new Box(); //Type mismatch: cannot convert from Box to Boxweight

    }
    
}
