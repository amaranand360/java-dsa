/*
 Given a sorted array 'arr' containing 'n' integers and an integer 'x',
 this class implements the 'upperBound' and 'lower bound'  function to find the index of
 the upper bound  and lower bound  of 'x' in the array.

 # Floor and Ceil in Sorted Array
 Problem Statement: You’re given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
 The floor of x is the largest element in the array which is smaller than or equal to x or targate.
 The ceiling of x is the smallest element in the array greater than or equal to x or targate.
 
 */

public class boundSearch {
    public class Solution {
        public static int upperBound(int[] arr, int x, int n) {
            int start = 0;
            int end = n - 1;
            int upperBound = n;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > x) {
                    upperBound = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return upperBound;
        }
    }

    public class LowerSolution {
        public static int lowerBound(int[] arr, int n, int x) {
            int start = 0;
            int end = n - 1;
            int mid;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] >= x) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return start < n ? start : n;

        }
    }

}
