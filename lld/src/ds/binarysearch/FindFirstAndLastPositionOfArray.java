package ds.binarysearch;

public class FindFirstAndLastPositionOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 7};
        int target = 5;
        execute(arr, target);
    }

    static void execute(int[] arr, int target) {
        int first = search(arr, target, true);
        int last = search(arr, target, false);
        System.out.println(first + " " + last);
    }

    static int search(int[] arr, int target, boolean isFirstIndex) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                result = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }
}
