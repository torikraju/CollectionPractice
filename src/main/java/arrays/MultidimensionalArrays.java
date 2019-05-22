package arrays;

import java.util.Arrays;

public class MultidimensionalArrays {

    private int[][] twoDArray = {{1, 2}, {2, 4, 3}, {2, 4, 3}};

    private void print2DArray() {
        System.out.println(Arrays.deepToString(twoDArray));
    }

    public static void main(String[] args) {
        MultidimensionalArrays arrays = new MultidimensionalArrays();
        arrays.print2DArray();
    }

}
