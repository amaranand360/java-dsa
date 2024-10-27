public class CountOcc {
    public static int count(int arr[], int n, int x) {
        int firstOccurrence = findFirst(arr, n, x);
        int lastOccurrence = findLast(arr, n, x);

        if (firstOccurrence == -1 || lastOccurrence == -1) {
            return 0;
        }

        return lastOccurrence - firstOccurrence + 1;
    }

    public static int findFirst(int[] arr, int n, int target) {
        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLast(int[] arr, int n, int target) {
        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}

