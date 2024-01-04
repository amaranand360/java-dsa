package oops.Inhiretance;

public class Box {
   double lenght;
   double height;
   double width;
//    double weight;

   Box(){
    lenght=3;
    height=6;
    width=5;
    System.out.println("Constructor Called l,h,w are :"+lenght+","+height+","+width);
   }
    //cube
    Box(double side){
    // super(); //Object class
    this.lenght=side;
    this.height=side;
    this.width=side;
   }
    Box(double l,double b, double h){
    this.lenght=l;
    this.width=b;
    this.height=h;
   }

   Box(Box old){
    this.lenght=old.lenght;
    this.height=old.height;
    this.width=old.width;
   }
   public void info(){
    System.out.println("the box is runnning");
   }
}

