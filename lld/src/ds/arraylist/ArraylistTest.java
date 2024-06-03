package ds.arraylist;

/**
 * int[] ros; Declaration of array
 * ros=new int[5]; initialization of array
 * int[] data= {1,2,4}
 */
public class ArraylistTest {
    public static void main(String[] args) {
        arrayTwoD();
    }
    static void arrayTwoD() {

        int[][] arr= {
            {1,2,3},
            {1,2,3,4},
            {1,2}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }

    }
}
