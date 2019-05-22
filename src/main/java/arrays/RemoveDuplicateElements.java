package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateElements {

    private static Integer[] removeDuplicates(Integer[] origArray) {

        Integer[] tempArray = new Integer[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++) {
            Integer currentElement = origArray[indexI];

            if (!currentElement.equals(origArray[indexI + 1])) {
                tempArray[indexJ++] = currentElement;
            }
        }

        tempArray[indexJ] = origArray[origArray.length - 1];

        return removeNull(tempArray);
    }

    private static Integer[] removeNull(Integer[] array) {
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.removeAll(Collections.singleton(null));
        return list.toArray(new Integer[list.size()]);
    }

    public static void main(String[] args) {
        Integer[] origArray = new Integer[]{1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 6};

        System.out.println(Arrays.toString(origArray));

        Arrays.sort(origArray);

        Integer[] tempArray = removeDuplicates(origArray);

        System.out.println(Arrays.toString(tempArray));

    }

}
