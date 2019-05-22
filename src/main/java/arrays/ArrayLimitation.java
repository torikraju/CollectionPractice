package arrays;

import java.util.Arrays;

public class ArrayLimitation {

    private int[] intArray = {1, 2, 3, 4, 5};

    private void printIntArray() {
        System.out.println("IntArray: " + Arrays.toString(this.intArray));
    }


    private void extendArray(int newLength) {
        int[] newIntArray = new int[newLength];
        for (int i = 0; i < this.intArray.length; i++) {
            newIntArray[i] = this.intArray[i];
        }
        this.intArray = newIntArray;
    }

    private void extendArrayUsingArrayCopy(int newLength) {
        int[] newIntArray = new int[newLength];
        System.arraycopy(this.intArray, 0, newIntArray, 0, this.intArray.length);
        this.intArray = newIntArray;
    }

    public static void main(String[] args) {
        ArrayLimitation arrayLimitation = new ArrayLimitation();
        arrayLimitation.printIntArray();
        System.out.println("------Extending array------");
//        arrayLimitation.extendArray(10);
        arrayLimitation.extendArrayUsingArrayCopy(10);
        arrayLimitation.printIntArray();
    }
}
