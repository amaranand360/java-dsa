// Q.Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.
import java.util.ArrayList;

//Better 
class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum = 0;
        int start = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > s && start < i) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                result.add(start + 1); // Adding 1 to convert from 0-based index to 1-based index
                result.add(i + 1);
                return result;
            }
        }

        result.add(-1); // If no subarray is found, return -1
        return result;
    }
}

public class ExdaynmicArray {

    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == s) {
                    result.add(i + 1); // Adding 1 to convert from 0-based index to 1-based index
                    result.add(j + 1); // Adding 1 to convert from 0-based index to 1-based index
                    return result;
                }
            }
        }

        result.add(-1); // If no subarray is found, return -1
        return result;
    }
}



