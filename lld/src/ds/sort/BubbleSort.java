package ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 1, 7, 2, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();
        }
    }
}
