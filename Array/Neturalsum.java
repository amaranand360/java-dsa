public class Neturalsum {
    
    static int missingNumber(int array[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < n-1; i++) {
            actualSum += array[i];
        }
        System.out.println("The act is: " + actualSum);
        System.out.println("The exp is: " + expectedSum);

        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int N = arr.length +1;
        int missingElement = missingNumber(arr, N);
        System.out.println("The missing element is: " + missingElement);
    }

    
}

