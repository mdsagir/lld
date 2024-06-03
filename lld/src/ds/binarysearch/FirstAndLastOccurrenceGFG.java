package ds.binarysearch;

public class FirstAndLastOccurrenceGFG {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 4, 4};
        solve(arr, 4);
    }

    static int[] solve(int[] arr, int target) {

        System.out.println(lastOccurrence(arr, target));
        return new int[]{};
    }

    static int firstOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = arr[mid];

            if (mid == target && (mid == 0 || midValue > arr[mid - 1])) {
                return mid;
            }
            if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = arr[mid];
            if (midValue == target && (mid == arr.length - 1 || target < arr[mid + 1])) {
                return mid;
            }

            if (target < midValue) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
