package ds.binarysearch;

public class PeekIndex {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1};
        findPeek(arr);
    }

    public static int findPeek2(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void findPeek(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Start " + start + " End " + end);
    }
}
