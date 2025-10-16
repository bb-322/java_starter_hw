package hw9;

public class ReversedArray {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : myReverse(array)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : subArray(array, 2, 20)) {
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

    public static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        index--;
        for (int i = 0; i < count; i++) {
            if (index + i < array.length) {
                newArray[i] = array[index + i];
            } else {
                newArray[i] = 1;
            }
        }

        return newArray;
    }
}