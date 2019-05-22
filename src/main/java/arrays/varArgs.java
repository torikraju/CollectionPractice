package arrays;

import java.util.Arrays;

public class varArgs {

    private void average(int... numbers) {
        System.out.println("Average: " + Arrays.stream(numbers).sum());
    }

    public static void main(String[] args) {
        varArgs varArgs = new varArgs();
        varArgs.average(2, 52, 52, 52, 57, 5, 7, 9);
    }
}
