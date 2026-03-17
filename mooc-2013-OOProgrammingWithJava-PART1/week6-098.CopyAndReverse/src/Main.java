import java.util.Arrays;
        
public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] arrCopy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrCopy[i] = array[i];
        }
        return arrCopy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] arrCopy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrCopy[i] = array[array.length - i - 1];
        }
        return arrCopy;
    }
}
