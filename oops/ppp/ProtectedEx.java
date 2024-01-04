package oops.ppp;
public class ProtectedEx {

    protected int num =101;
    private String name="AMAR";
     //accessing the protected variable through a subclass
    public int age=20;

     ProtectedEx(){
        System.out.println("Inside constructor"+name+" num->"+num);
    } 

    ProtectedEx(int num){
        System.out.println("Inside constructor"+name+" num->"+num);
    } 
    public void info(){
        System.out.println("Number is & age is : "+num+","+age);
    }


}

