package ds.binarysearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 10, 15, 19, 33, 36, 45};
        int target = 12;
        System.out.println(ceilingNumber(arr,target));
    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Start "+start+" End "+end);
        return start;
    }
}
