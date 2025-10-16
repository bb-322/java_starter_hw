package hw9;
import java.util.Arrays;
public class UserArray {
    static void main() {
        int[] arr = {1,2,3};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : editArray(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : addToArray(arr, 6)) {
            System.out.print(i + " ");
        }
    }

    static int[] editArray (int[] array) {
        return Arrays.copyOf(array, array.length+1);
    }

    static int[] addToArray (int[] array, int value) {
        int[] newArr = new int[array.length+1];
    /*  for (int i = newArr.length-1; i > 0; i--) {
            newArr[i] = array[i-1];
        }
    */
        System.arraycopy(array, 0, newArr, 1, array.length);
        newArr[0] = value;
        return newArr;
    }
}