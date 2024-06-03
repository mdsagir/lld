package ds.arraylist;

import java.util.Arrays;

public class TwoDLinearSearch {
    public static void main(String[] args) {
        int[][] arr =new int[][] {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };


        int[] number = findNumber(arr, 9);
        System.out.println(Arrays.toString(number));
    }
    static int[] findNumber(int[][] arr,int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
