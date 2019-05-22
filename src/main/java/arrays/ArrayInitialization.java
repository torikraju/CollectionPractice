package arrays;

import java.util.Arrays;

public class ArrayInitialization {

    private boolean[] booleanArray = {true, false, false};
    private int[] intArray = {1, 3, 5, 5, 6};
    private String[] stringArray = {"String1", "String2", "String3", "String4"};
    private Student[] studentArray = {
            new Student(1, "name1"),
            new Student(2, "name2"),
            new Student(3, "name3"),
            new Student(4, "name4"),
    };

    private void printBooleanArray() {
        System.out.println("BooleanArray: " + Arrays.toString(this.booleanArray));
    }

    private void printIntArray() {
        System.out.println("IntArray: " + Arrays.toString(this.intArray));
    }

    private void printStringArray() {
        System.out.println("StringArray: " + Arrays.toString(this.stringArray));
    }

    private void printStudentArray() {
        System.out.println("StudentArray: " + Arrays.toString(this.studentArray));
    }

    public static void main(String[] args) {
        ArrayInitialization arrayDefaults = new ArrayInitialization();
        arrayDefaults.printBooleanArray();
        arrayDefaults.printIntArray();
        arrayDefaults.printStringArray();
        arrayDefaults.printStudentArray();
    }


}
