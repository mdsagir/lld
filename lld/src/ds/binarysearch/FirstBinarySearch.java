package ds.binarysearch;

public class FirstBinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 12, 15, 25, 29, 33, 40};
        int search = binarySearch(arr, 20);
        System.out.println(search);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = arr[mid];
            /*if (target == midValue) {
                return mid;
            }*/
            if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("s "+start+" "+end);
        return arr[start];
    }
}
