package oops.polymorphism;

public class Staticpoly { //static-polymorphsim 
    double lenght;
    double height;
    double width;
    
    //mutiple constructor is example of //static-polymorphsim achive by method overloading 
    
    Staticpoly(){
        lenght=3;
        height=6;
        width=5;
        System.out.println("Constructor Called l,h,w are :"+lenght+","+height+","+width);
       }
        //cube
        Staticpoly(double side){
        this.lenght=side;
        this.height=side;
        this.width=side;
       }
        Staticpoly(double l,double b, double h){
        this.lenght=l;
        this.width=b;
        this.height=h;
       }
    
       Staticpoly(Staticpoly old){
        this.lenght=old.lenght;
        this.height=old.height;
        this.width=old.width;
       }

}
