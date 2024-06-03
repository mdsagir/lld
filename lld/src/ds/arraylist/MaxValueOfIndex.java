package ds.arraylist;

public class MaxValueOfIndex {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 7, 3, 4, 5, 6, 7};
//        System.out.println(max(arr));
        //   System.out.println(secondMax(arr));

        int x = 2;

        System.out.println(x & 1);

    }

    static int max(int[] arr) {

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int secondMax(int[] arr) {
        int max = max(arr);
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[max]) {

                if (secondMax == -1) {
                    secondMax = i;
                }
                if (arr[i] > arr[secondMax]) {
                    secondMax = i;
                }
            }
        }
        return secondMax;
    }
}
