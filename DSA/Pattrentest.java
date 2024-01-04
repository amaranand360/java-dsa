package DSA;

public class Pattrentest {

    public static void main(String[] args) {
        int n = 9;
       
        for (int row = 0; row <= n; row += 2) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                    System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

}

/*
 * 1
 * 12
 * 123
 */
// for (int row = 1; row <=n; row++) {
// for (int col = 1; col <= row; col++) {
// System.out.print(col);
// }
// System.out.print("\n");
// }

/*
 * 1
 * 22
 * 333
 */

// for (int row = 1; row <=n; row++) {
// for (int col = 1; col <= row; col++) {
// System.out.print(row);
// }
// System.out.print("\n");
// }

// revert incrementer star
// for (int row = 0; row <n; row++) {
// for (int col = row; col <n ; col++) {
// System.out.print("* ");
// }
// System.out.print("\n");
// }

/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
// for (int row = 0; row <n; row++) {
// for (int col = 1; col <=n-row ; col++) {
// System.out.print(col);
// }
// System.out.print("\n");
// }


// public class Pattrentest {

//     public static void main(String[] args) {
//         int n = 5;
        
//         for (int row = 0; row < n; row++) {

//             for (int col = 0; col < n - row - 1; col++) {
//                 System.out.print(" ");
//             }
//             for (int col = 0; col <row;col++) {

//                 System.out.print("*");
//             }
//             System.out.print("*");
//             for (int k = 0; k <row;k++) {

//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }

// }