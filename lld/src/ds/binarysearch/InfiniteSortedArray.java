package ds.binarysearch;

import java.util.Arrays;
import java.util.Random;

public class InfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        execute2(arr,10);

    }

    public static void execute2(int[] arr, int target) {
        System.out.println("target " + target);
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end + 1;
            end = start * 2;
        }
        int search = search(arr, start, end, target);
        System.out.println(search);
    }

    static int search(int[] arr, int start, int end, int target) {

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
        return -1;
    }
}
