package oops.staticexm;
//   static class InnerStaticBlock {  //can't define static outside the public
//         String name;
//         public InnerStaticBlock(String name){
//             this.name = name;
//         }
        
//     }

    // class InnerStaticBlock {  
    //     static String name;
    //     public InnerStaticBlock(String name){
    //         InnerStaticBlock.name = name;
    //     }
        //  System.out.println(amar.name); //kunal
        // System.out.println(kunal.name); //kunal
    // }
    
 public class StaticBlock {

    static class InnerStaticBlock {
        String name;
        public InnerStaticBlock(String name){
            this.name = name;
        }
        
    }
    //static block to initialize the values of variables
    static int x = 10;
    static int y;
    static{
        //will run only ones when the class is loaded, static block is executed when the program starts and only once
        y = x*5;
        System.out.println("Static Block Executed");
    }

    public static void main(String[] args) {
        // StaticBlock obj = new StaticBlock();
        System.out.println("Value of x & Y : "+StaticBlock.x+ "&" + StaticBlock.y);// 10 & 50

        StaticBlock.x +=5;
        System.out.println("After incrementing value of x by 5, Value of x  : "+StaticBlock.x); //15 

        // StaticBlock ob2 = new StaticBlock();
        System.out.println("Value of x & Y : "+StaticBlock.x+ "&" + StaticBlock.y); //15 & 50

        
        InnerStaticBlock amar = new InnerStaticBlock("amar");
        InnerStaticBlock kunal = new InnerStaticBlock("kunal");

        // StaticBlock obj = new StaticBlock();  // when class in non-static
        // InnerStaticBlock amar = obj.new InnerStaticBlock("amar");
        // InnerStaticBlock kunal = obj.new InnerStaticBlock("kunal");  

        
        System.out.println(amar.name); //amar
        System.out.println(kunal.name); //kunal


    }
    
}
