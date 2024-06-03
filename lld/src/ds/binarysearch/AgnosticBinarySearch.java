package ds.binarysearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int result = agnosticBinarySearch(arr2, 3);
        System.out.println(result);
    }

    static int agnosticBinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
