
public class Program {

    public static void main(String[] args) {
        int[][] square1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        MagicSquare ms1 = new MagicSquare(square1);
        System.out.println(ms1);
        System.out.println(" R " + ms1.sumsOfRows());
        System.out.println(" C " + ms1.sumsOfColumns());
        System.out.println(" D " + ms1.sumsOfDiagonals());
        System.out.println(" N " + ms1.giveAllNumbers());
        System.out.println("ND " + ms1.allNumbersDifferent());
        System.out.println("SS " + ms1.sumsAreSame());
        System.out.println();
        
        int[][] square2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };        
        MagicSquare ms2 = new MagicSquare(square2);
        System.out.println(ms2);
        System.out.println(" R " + ms2.sumsOfRows());
        System.out.println(" C " + ms2.sumsOfColumns());
        System.out.println(" D " + ms2.sumsOfDiagonals());
        System.out.println(" N " + ms2.giveAllNumbers());
        System.out.println("ND " + ms2.allNumbersDifferent());
        System.out.println("SS " + ms2.sumsAreSame());
        System.out.println();
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare ms = msFactory.createMagicSquare(7);
        System.out.println(ms);
        System.out.println("SR " + ms.sumsOfRows());
        System.out.println("SC " + ms.sumsOfColumns());
        System.out.println("SD " + ms.sumsOfDiagonals());
        System.out.println("AN " + ms.giveAllNumbers());
        System.out.println("ND " + ms.allNumbersDifferent());
        System.out.println("SS " + ms.sumsAreSame());
    }

}
