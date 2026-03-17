
import java.util.Arrays;

public class MagicSquareFactoryFil {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            return null;
        }

        MagicSquare square = new MagicSquare(size);

        int count = 1;
        int y = 0;
        int x = size / 2;
        while (true) {
            square.placeValue(y, x, count);

            count++;
            if (((y == 0) && (x >= size - 1)) && (square.readValue(size - 1, 0) != 0)) {
                y++;
            } else {
                y--;
                if (y < 0) {
                    y = size - 1;
                }
                x++;
                if (x == size) {
                    x = 0;
                }
                if (square.readValue(y, x) != 0) {
                    y += 2;
                    x--;
                }
            }

            if (count == size * size + 1) {
                break;
            }
        }

        return square;
    }

}
