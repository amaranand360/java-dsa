package oops.ppp;

 public class Main extends ProtectedEx {
    int number;
    number = super.num;
   public static void main(String[] args) {
    ProtectedEx obj1 =new ProtectedEx(6);   
    Main obj2=new Main();
    System.out.println("Value of protected variable in obj1 : "+obj1.num);  // Accessing the
    obj1.info();

   }
}
