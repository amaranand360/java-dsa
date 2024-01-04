package oops.polymorphism;
public class Dynamicpoly {

  //dynamic-polymorphsim achive by method overriding 

    public class Shape{
        void area(){
            System.out.println("i am in shape !");
        }
    }

     public class Circle extends Shape{ 
        //hence it overriding the parent class method
        @Override  // this is called anotation
        void area(){
            System.out.println("i am in circle !");
        }
    }

     public class Triangle extends Shape{
        @Override
        void area(){
            System.out.println("i am in triangle !");
        }
    }

     public class Retangle extends Shape{
        void area(){
            System.out.println("i am in ratangle !");
        }
    }

    Shape obj1 = new Shape();
    Shape obj2 = new Circle();
    Shape obj3 = new Triangle();
    Shape obj4 = new Retangle();
    //same method used is mutiple class but which method is run decide by the obj which class referance 
    public static void main(String[] args) {
        Dynamicpoly dp=new Dynamicpoly();
        dp.obj4.area();
    }
    
}
