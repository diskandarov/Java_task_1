public class Main1 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 4, 5, 6},
                {1, 4, 5, 6, 7},
                {4, 5, 1, 8, 6},
                {5, 6, 3, 2, 1},
                {2, 5, 6, 7, 8}
        };
        int min1 = array[0][array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if ((min1 > array[array.length - 1 - i][i]) & ((array.length - 1 - i)!=i)) {
                min1 = array[array.length - 1 - i][i];
            }
        }
        System.out.println(min1);

    }
}