import java.util.Scanner;

// import java.util.Arrays;

public class Exarray {
    public static void main(String[] args) {
    // String name = "Amar";
    // int a=10;
    // int b=20;
    // int c=30;

    //syntax of deleacer 1D array
    // datatype variable_name = new datatype[size];
    // int[] students = new int[5];

     //syntax of deleacer 2D array
     // datatype variable_name = new datatype[size][size];
    //  int[][] matrix = new int[3][3];  //no of row define is required
    //  int[][] matrix2 = new int[3][];  //no of col is not required

    // System.out.println(Arrays.toString(marks));
    // changeArray(marks, 3);
    // System.out.println(Arrays.toString(marks));
    int[] marks = {56,89,90,45,76};
    printArray(marks);

    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to enter: ");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    printArray(arr);

    }
    //  static void inputArray(int[] array){
    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0;i<array.length;i++){
    //     array[i] = sc.nextInt();
    //     }
    // }

    static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
        System.out.println("Element in marks array at index "+i+" :"+array[i]);
        }
    }

    // static void changeArray(int[] arr,int i){
    //     arr[0]=99;
    //     //some process
    //     arr[i]=371;
    // }
}



/*  Kadane's Algorithm
Q.Given an array Arr[] of N integers. 
Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
*/

// class Solution{

//     long maxSubarraySum(int arr[], int n){
//         long sum = 0;
//         long maxi = arr[0];
        
//         for(int i=0;i<n;i++){
            
//             sum = sum+arr[i];
//             maxi = Math.max(maxi,sum);
            
//             if(sum<0)
//                 sum=0;
//         }
//         return maxi;
//     }
    
// }