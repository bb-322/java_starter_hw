package hw9;

public class Task6 {
    static void main() {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] arr3 = new int[3][3];

        add(arr3, arr1, arr2);

        System.out.println("arr3: ");
        for (int[] row : arr3) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
    }

    static void add(int[][] newArr, int[][] array1, int[][] array2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newArr[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }
}