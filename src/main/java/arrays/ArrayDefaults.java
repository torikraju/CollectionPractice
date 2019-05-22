package arrays;

import java.util.Arrays;

public class ArrayDefaults {

    private boolean[] booleanArray = new boolean[3];
    private int[] intArray = new int[5];
    private String[] stringarray = new String[5];
    private Student[] studentArray = new Student[4];

    private void printBooleanArray() {
        System.out.println("BooleanArray: " + Arrays.toString(this.booleanArray));
    }

    private void printIntArray() {
        System.out.println("IntArray: " + Arrays.toString(this.intArray));
    }

    private void printStringArray() {
        System.out.println("StringArray: " + Arrays.toString(this.stringarray));
    }

    private void printStudentArray() {
        System.out.println("StudentArray: " + Arrays.toString(this.studentArray));
    }

    public static void main(String[] args) {
        ArrayDefaults arrayDefaults = new ArrayDefaults();
        arrayDefaults.printBooleanArray();
        arrayDefaults.printIntArray();
        arrayDefaults.printStringArray();
        arrayDefaults.printStudentArray();
    }


}
