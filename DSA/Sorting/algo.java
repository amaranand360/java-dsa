package DSA.Sorting;

class algo {
    static void bubble_sort(int[] arr, int n) {
        //bubble_sort
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j <= i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        
        // selection_sort
        //selection_sort
    //     for (int i = 0; i < n; i++) {
    //         int min_index = i;
    //         for (int j = i; j < n; j++) {
    //         if(arr[min_index] > arr[j]){
    //             min_index = j;
    //         }
    //         //swap
    //         int temp = arr[min_index];
    //         arr[min_index] = arr[i];
    //         arr[i] = temp;
    //     }
    // }
    
    //insertion_sort
    // for (int i = 0; i <= n - 1; i++) {
    //     int j = i;
    //     while (j > 0 && arr[j - 1] > arr[j]) {
    //         int temp = arr[j - 1];
    //         arr[j - 1] = arr[j];
    //         arr[j] = temp;
    //         j--;
    //     }
    // }

    //insertion sort
    for(int i=1; i<arr.length; i++) {
        int current = arr[i];
        int j = i-1;
        while(j >= 0 && current < arr[j]) {
            arr[j+1] = arr[j];
            j--;
        }
    //placement
    arr[j+1] = current;
    }


    //bubble_sort
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j<n-i; j++) {
        //      if (arr[j-1] > arr[j]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j - 1];
        //             arr[j - 1] = temp;
        //         }
        // }
    
        //bubble_sort
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
                
        //         // Check if the current element arr[i] is smaller than arr[j]
        //         if (arr[i] < arr[j]) {
        //             // Swap arr[i] and arr[j]
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using  Sorting Algo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
    }

}