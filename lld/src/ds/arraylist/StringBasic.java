package ds.arraylist;

/**
 * Can travers string by
 * a) normal array
 * String str="India";
 * char[] arr=str.toCharArray();
 * for(int i=0;i<arr.length;i++) {
 *     char newChar=arr[i];
 * }
 * b) By charAt(i)
 *  String str="India";
 *   for(int i=0;i<str.length();i++) {
 *      char newChar=str.charAt[i];
 *  }
 *  c) String str="India";
 *   for(char c:str.toCharArray()) {
 *      char newChar=c;
 *   }
 */
public class StringBasic {
    public static void main(String[] args) {

        String search = "Mumbai";
        System.out.println(search3(search, 'M'));
    }

    static boolean search(String str, char c) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char c) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    static boolean search3(String str, char c) {

        for (char ch : str.toCharArray()) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}
