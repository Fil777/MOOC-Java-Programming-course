
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values1 = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values1));

        System.out.println("Index of the smallest: " + indexOfTheSmallest(values1));

        int[] values2 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 4));

        int[] values3 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values3));

        swap(values3, 1, 0);
        System.out.println(Arrays.toString(values3));

        swap(values3, 0, 3);
        System.out.println(Arrays.toString(values3));

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(values));
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minIdx = index;
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < array[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int indexFirst = 0;
        int indexMin = indexOfTheSmallest(array);
        swap(array, indexFirst, indexMin);
        while (indexFirst < array.length - 1) {
            indexFirst++;
            indexMin = indexOfTheSmallestStartingFrom(array, indexFirst);
            swap(array, indexFirst, indexMin);
        }
    }

}
