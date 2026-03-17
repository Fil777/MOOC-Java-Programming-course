
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers1));
        sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int n : array) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}
