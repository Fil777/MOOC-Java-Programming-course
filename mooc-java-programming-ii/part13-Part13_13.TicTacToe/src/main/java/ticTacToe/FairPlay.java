package ticTacToe;

/**
 *
 * @author Fil
 */
public class FairPlay {

    private boolean xTurn;
    private int[][] playField;

    public FairPlay() {
        xTurn = true;
        playField = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                playField[x][y] = 0;
            }
        }
    }

    public String getTurn() {
        if (xTurn) {
            return "X";
        } else {
            return "O";
        }
    }
    
    public boolean isEmpty(int x, int y){
        return playField[x][y] == 0;
    }

    public void makeTurn(int x, int y) {
        if (x < 0 || x >= 3 || y < 0 || y >= 3) {
            return;
        }
        if (!isEmpty(x, y)) {
            return;
        }
        if (xTurn) {
            playField[x][y] = 1;
            if (victoryX()) {
                return;
            }
        } else {
            playField[x][y] = -1;
            if (victoryO()) {
                return;
            }
        }
        xTurn = !xTurn;
    }

    private int rowSum(int row) {
        int sum = 0;
        for (int x = 0; x < 3; x++) {
            sum += playField[x][row];
        }
        return sum;
    }

    private int colSum(int col) {
        int sum = 0;
        for (int y = 0; y < 3; y++) {
            sum += playField[col][y];
        }
        return sum;
    }

    private int diag1Sum() {
        int sum = 0;
        for (int d = 0; d < 3; d++) {
            sum += playField[d][d];
        }
        return sum;
    }

    private int diag2Sum() {
        return playField[0][2] + playField[1][1] + playField[2][0];
    }

    public boolean victoryX() {
        if (diag1Sum() == 3 || diag2Sum() == 3) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if (rowSum(i) == 3 || colSum(i) == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean victoryO() {
        if (diag1Sum() == -3 || diag2Sum() == -3) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if (rowSum(i) == -3 || colSum(i) == -3) {
                return true;
            }
        }
        return false;
    }
    
    public boolean victory(){
        return victoryX() || victoryO();
    }
}
