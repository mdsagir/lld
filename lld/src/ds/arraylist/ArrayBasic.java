package ds.arraylist;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = {2,1,4,1,9,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int findMax(int[] arr) {

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr) {

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min=arr[i];
            }
        }
        return min;
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
         while (start < end){
             swap(arr,start,end);
             start++;
             end--;
         }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
