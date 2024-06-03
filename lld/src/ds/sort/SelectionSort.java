package ds.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4, 2, 3, 5, 6, 1, 0, 8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
