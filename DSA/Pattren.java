
/**
 * Pattren
 */
public class Pattren {

      public static void main(String[] args) {

    int n=6;
    int start=1;
    int end = n;

    //    for(int row = start;row<=end; row++){   //incrementing star 
    //     for(int col =1;col<=row;col++){
    //     System.out.print("* ");
    //    }
    //    System.out.print("\n");
    // }

    //    for(int row = start;row<=end; row++){   //Right-Angled Number Pyramid 
    //     for(int col =1;col<=row;col++){
    //       System.out.print(col);
    //    }
    //    System.out.print("\n");
    // }


    //    for(int row = start;row<=end; row++){   ////Right-Angled Number Pyramid 
    //     for(int col =1;col<=row;col++){
    //       System.out.print(row);
    //    }
    //    System.out.print("\n");
    // }

    // for(int row = start;row<=end; row++){   //decrementing star
    //     for(int col =end;col>=row;col--){
    //     System.out.print("* ");
    //    }
    //    System.out.print("\n");
    // }

    // for(int row = n-1;row>0; row--){   //Triangle shape. 
    //     for(int col =1;col<=row;col++){
    //     System.out.print("* ");
    //    }
    //    System.out.print("\n");
    // }


    // for(int row = 1;row<5; row++){        // squre pattren
    //     for(int col =1;col<5;col++){
    //     System.out.print(" * ");
    //    }
    //    System.out.print("\n");
    // }


    //int n = 5;                //empty squre.
    // for(int row = 1;row<n; row++){
    //     for(int col =1;col<n;col++){
    //         if(row == 1 || row == n-1  || col== 1 ||col== n-1 )
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");

    //         }
    //    }
    //    System.out.println();
    // }


    // int n=5;            // c-shape
    // for(int row = 1;row<n; row++){ 
    //     for(int col =1;col<n;col++){
    //         if(row == 1|| row == n-1 || col==1 ){
    //             System.out.print(" * ");
    //         }
    //         // else{
    //         //     System.out.print("  ");

    //         // }
    //    }
    //    System.out.println();
    // }
    
    // int n=5;
    // for(int row = 1;row<=n; row++){  // right angle triangle  
    //     for(int col =1;col<=row;col++){
    //         if(row == col || col==1 || row==n)
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }


    // int n=5;
    // for(int row = 1;row<=n; row++){  //   N -shape  
    //     for(int col =1;col<=n;col++){
    //         if(row == col || col==n || col==1)
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }

    // int n=5;
    // for(int row = 1;row<=n; row++){  //     Z-shape 
    //     for(int col = n;col>=1;col--){
    //         if(row == col ||row==1 || row==n)
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    //}


    // int n=6;
    // for(int row = 1;row<n; row++){      //  cross-sign   printing
    //     for(int col=1;col<n;col++){
    //         if(row == col || col==(n-row))
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }

    // int n=6;
    // for(int row = 1;row<n; row++){      // rigth angle triangle printing
    //     for(int col=1;col<n;col++){
    //         if(col >=(n-row))
    //             System.out.print(" * ");
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }

    // int n=6;
    // for(int row = 1;row<n; row++){      //diff design rigth angle triangle printing
    //     for(int col=n-1;col>0;col--){
    //         if( n-row  >= col ){
    //             System.out.print(" * ");
    //         }
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }


    // for(int row = 1;row<8; row++){      // T shape  printing
    //     for(int col=1;col<8;col++){
    //         if(row==1 || col==4){
    //             System.out.print(" * ");
    //         }
    //         else{
    //             System.out.print("   ");
    //         }
    //    }
    //    System.out.println();
    // }


    //Star Pyramid
    // for (int i = 0; i < end; i++)
    // {
    //     // For printing the spaces before stars in each row
    //     for (int j =0; j<end-i-1; j++)
    //     {
    //         System.out.print(" ");
    //     }
       
    //     // For printing the stars in each row
    //     for(int j=0;j< 2*i+1;j++){
            
    //         System.out.print("*");
    //     }
        
    //     // For printing the spaces after the stars in each row
    //      for (int j =0; j<end-i-1; j++)
    //     {
    //         System.out.print(" ");
    //     }
       

    //     // As soon as the stars for each iteration are printed, we move to the
    //     // next row and give a line break otherwise all stars
    //     // would get printed in 1 line.
    //     System.out.println();
    //   }



  //   for(int i=1;i<=2*end-1;i++){
  //     // stars would be equal to the row no. uptill first half
  //     int stars = i;
      
  //     // for the second half of the rotated triangle.
  //     if(i>end) stars = 2*end-i;
      
  //     // for printing the stars in each row.
  //     for(int j=1;j<=stars;j++){
  //         System.out.print("*");
  //     }
  //     System.out.println();
  // }

}


}

  
