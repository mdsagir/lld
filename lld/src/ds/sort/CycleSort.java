package ds.sort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currentIndex = i;
            int currentValue = arr[i] - 1;

            if (currentValue != currentIndex) {
                int temp = arr[currentValue];
                arr[currentValue] = arr[currentIndex];
                arr[currentIndex] = temp;
            } else {
                i++;
            }

        }
    }
}
