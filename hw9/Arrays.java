package hw9;

public class Arrays {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : myReverse(array)) {
            System.out.print(i + " ");
        }
    }

    static int[] myReverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length; i > 0; i--) {
            newArray[array.length - i] = array[i-1];
        }
        return newArray;
    }
}