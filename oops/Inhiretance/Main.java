package oops.Inhiretance;

public class Main {
    /**
     * BOX class is main or head class here!
     */
    class BOX {
        double lenght;
        double height;

        void printInfo(double side){
            this.lenght=side;
            this.height=side;
           }
        
    }
    //single inhiretance Base class->child class
    class BoxWeight extends BOX{
        int weight;
        public void setWeight(int w){
            this.weight = w;
            System.out.println("single inhiretance example");
        }
    }

    //muti-level inhiretance Example  like grandfather ,father and son like that
     class Boxprice extends BoxWeight{
        double price;
        public void setPrice(double p) {
            this.price = p;
            System.out.println("multi-level inhiretance example");

        }
    }

    //hierachial inhiretance
     /**
     *     hierachial inhiretance Example  like one parent and more than one children
     */

    //  class BoxWeight extends BOX{
    //     int weight;
    //     public void setWeight(int w){
    //         this.weight = w;
    //         System.out.println("single inhiretance example");
    //     }
    // }

    class Boxcolor extends BOX{
        String color;

        void printInfo(String color){
            this.color=color;
           }
    }

    /* hybride inhiretance : The process of combining more than one type of Inheritance together while deriving subclasses in a program is called a Hybrid Inheritance.
    
    and multiple inhiretance: Multiple inheritance means that a subclass can inherit from two or more superclasses. 
    
    both are  not suporated by java.

    */
}
