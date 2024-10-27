// Search Insert Position

/* Given a sorted array of distinct integers and a target value,
 return the index if the target is found. If not, 
 return the index where it would be if it were inserted in order.
 */
public class CelingNum {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length -1;
            while(start <= end)
            {
                int mid = start + (end - start )/2;
                if(nums[mid] == target )
                    return mid;
                else if(nums[mid] < target)
                    start = mid+1;
                else 
                    end = end-1;
            }
            return start ;
        }
    }
    
    //The ceiling of x is the smallest element in the array greater than or equal to x( i.e. smallest element in the array >= x).
    public class CelingSolution {
        public static int lowerBound(int []arr, int n, int x) {
            int start = 0;
            int end = n-1;
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


