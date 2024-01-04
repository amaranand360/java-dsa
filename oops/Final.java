package oops;


public class Final {
public static void main (String[] args){

    final int a = 10;  //here a is primitive datatype 
    // a=67;    //The final local variable a cannot be assigned.
    int b=20;
    // Integer num = 45;  //here num is object 
    
    String name="Amar";
    System.out.println(name);
    swap(a, b);
    System.out.println(a + " " +b);


    final Person amar = new Person("AMAR");
    amar.name = "anand";         //we can change the perporties

    //when a non-primitive is final Then the final local variable  cannot be re-assigned
    // amar = new Person("new object");
}
    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a + " " +b);
    }

    /**
     * InnerAmar
     */
    static class Person {
        final int num = 14;
        String name;

        Person(String name){
            System.out.println(this.name);
        }
        
    }
}
