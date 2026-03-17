
public class AdvancedAstrology {

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
    
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();   
    }

    public static void printSpaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        while (i < size) {
            i++;
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // 40.3
        int i = 0;
        int n = 1;
        while (i < height) {
            i++;
            printSpaces(height-i);
            printStars(n);
            n+=2;
        }    
        printSpaces(n/2-2);
        printStars(3);
        printSpaces(n/2-2);
        printStars(3);        
    }    
}
