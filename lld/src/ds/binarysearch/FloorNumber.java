package ds.binarysearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 10};
        int target = 3;

        System.out.println(getData(arr, target));
    }

    static int getData(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }

}
