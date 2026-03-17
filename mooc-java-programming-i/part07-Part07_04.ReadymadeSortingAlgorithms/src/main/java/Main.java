
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        String[] strArray = {"zzz", "bbb", "aaa"};
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(199);
        intList.add(011);
        intList.add(121);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("zzz");
        strList.add("aaa");
        strList.add("bbb");

        printArray(array);
        sort(array);
        printArray(array);

        printArray(strArray);
        sort(strArray);
        printArray(strArray);

        printIntList(intList);
        sortIntegers(intList);
        printIntList(intList);

        printStrList(strList);
        sortStrings(strList);
        printStrList(strList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printIntList(ArrayList<Integer> arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printStrList(ArrayList<String> arr) {
        for (String n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
