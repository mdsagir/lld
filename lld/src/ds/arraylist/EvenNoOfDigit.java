package ds.arraylist;

public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] arr = {555, 901, 482, 1771};

        System.out.println(evenNo(arr));
    }

    static int evenNo(int[] arr) {
        int count=0;
        for (int no : arr) {
            boolean isEven = findEvenNoDigit(no);
            if (isEven) {
                count++;
            }
        }
        return count;
    }

    private static boolean findEvenNoDigit(int no) {
        int count = 0;
        while (no > 0) {
            count++;
            no = no / 10;
        }
        return count % 2 == 0;
    }
}
