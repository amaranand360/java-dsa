import java.util.*;
import java.io.*;

//  Find the floor  'x' in 'a[0..n-1]'.
//The floor of x is the largest element in the array which is smaller than or equal to x( i.e. largest element in the array <= x)
public class Floor {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    start = mid + 1;
                else
                    end = end - 1;
            }
            return end;
        }
    }

    // You're given a sorted array 'a' of 'n' integers and an integer 'x'.
    // Find the floor and ceiling of 'x' in 'a[0..n-1]'.
    public class CombinedSolution {
        public static int[] getFloorAndCeil(int[] a, int n, int x) {
            int[] result = { -1, -1 };
            int start = 0;
            int end = n - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (a[mid] == x) {
                    result[0] = a[mid];
                    result[1] = a[mid];
                    return result;
                } else if (a[mid] < x)
                    start = mid + 1;
                else
                    end = end - 1;
            }
            // If 'x' is greater than the largest element in the array
            if (end == -1) {
                result[0] = -1;
                result[1] = a[start];
            }
            // If 'x' is smaller than the smallest element in the array
            else if (start == n) {
                result[0] = a[end];
                result[1] = -1;
            } else {
                result[0] = a[end];
                result[1] = a[start];
            }

            return result;

        }

    }

}
