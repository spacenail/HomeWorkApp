import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static int areaSize;
    static final char EMPTY_CELL_SYMBOL = '-';
    static final char X_SYMBOL = 'X';
    static final char O_SYMBOL = 'O';

    public static void start() {
        areaSize = 3;
        System.out.println("Game start!");
        char[][] field = initArray(areaSize);
        drawField(field);
        do {
            playerMove(field);
            drawField(field);
            if (isWin(field, X_SYMBOL)) {
                System.out.println("Congratulations!!! You are winner.");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }

            botMove(field);
            drawField(field);
            if (isWin(field, O_SYMBOL)) {
                System.out.println("Sorry!!! You are loser. :(");
                break;
            }
            if (isDraw(field)) {
                System.out.println("This is draw!!!");
                break;
            }
        } while (true);

    }

    public static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static char[][] initArray(int areaSize) {
        char[][] field = new char[areaSize][areaSize];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = EMPTY_CELL_SYMBOL;
            }
        }
        return field;
    }

    static boolean isDraw(char[][] field) {
        for (int v = 0; v < field.length; v++) {
            for (int h = 0; h < field.length; h++) {
                if (isEmptyCell(field, v, h)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void playerMove(char[][] field) {
        int xCoordinate;
        int yCoordinate;
        do {
            xCoordinate = userInput("x");
            yCoordinate = userInput("y");

        } while (!isEmptyCell(field, xCoordinate, yCoordinate));
        field[xCoordinate][yCoordinate] = X_SYMBOL;

    }

    public static void botMove(char[][] field) {
        int x, y;
        Random random = new Random();
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (!isEmptyCell(field, x, y));
        field[x][y] = O_SYMBOL;
    }

    public static int userInput(String coordinateName) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please input %s coordinate [from 1 to %s]... ", coordinateName, areaSize);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= areaSize);
        return coordinate;
    }

    public static boolean isEmptyCell(char[][] field, int xCoordinate, int yCoordinate) {
        return field[xCoordinate][yCoordinate] == EMPTY_CELL_SYMBOL;
    }

    static boolean isWin(char[][] field, char sign) {
        // Horizontal
        boolean horizontalMarker = false;
        for (int i = 0; i < field.length; i++) {
            horizontalMarker = false;
            for (int j = 0; j < field.length - 1; j++) {
                if (field[i][j] == sign && field[i][j + 1] == sign) {
                    horizontalMarker = true;
                } else {
                    horizontalMarker = false;
                    break;
                }
            }
            if (horizontalMarker == true) {
                return true;
            }
        }
        // Vertical
        boolean verticalMarker = false;
        for (int i = 0; i < field.length; i++) {
            verticalMarker = false;
            for (int j = 0; j < field.length - 1; j++) {
                if (field[j][i] == sign && field[j + 1][i] == sign) {
                    verticalMarker = true;
                } else {
                    verticalMarker = false;
                    break;
                }
            }
            if (verticalMarker == true) {
                return true;
            }
        }

        // Diagonals
        boolean diagonalMarkerLeft = false;
        for (int i = 0; i < field.length - 1; i++) {
            if (field[i][i] == sign && field[i + 1][i + 1] == sign) {
                diagonalMarkerLeft = true;
            } else {
                diagonalMarkerLeft = false;
                break;
            }
        }
        if (diagonalMarkerLeft == true) {
            return true;
        }

        boolean diagonalMarkerRight = false;
        for (int i = 0; i < field.length - 1; i++) {
            if (field[i][field.length - (1 + i)] == sign && field[i + 1][field.length - (2 + i)] == sign) {
                diagonalMarkerRight = true;
            } else {
                diagonalMarkerRight = false;
                break;
            }
        }
        if (diagonalMarkerRight == true) {
            return true;
        }
        return false;
    }
}