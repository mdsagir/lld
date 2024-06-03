package ds.arraylist;

public class MaxWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        int i = findWealth(arr);
        System.out.println(i);
    }

    private static int findWealth(int[][] arr) {
        int max = 0;
        for (int row = 0; row < arr.length; row++) {
            int colMax = 0;
            for (int col = 0; col < arr[row].length; col++) {
                    colMax += arr[row][col];

            }
            if (colMax > max) {
                max = colMax;
            }
        }
        return max;
    }
}
