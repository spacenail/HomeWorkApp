public class TicTacToe {
   static final char EMPTY_CELL_SYMBOL = '-';
   static final char X_SYMBOL = 'X';
   static final char O_SYMBOL = 'O';

    public static void start() {
        char[][] fieldArray = initArray(); // you can change game field with int areaSize
        drawField();
    }

    public static void drawField(char[][] fieldArray){
        for (int i = 0; i < fieldArray.length; i++) {
            for (int j = 0; j < fieldArray[i].length; j++) {
                System.out.print(fieldArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static char[][] initArray(){
        char[][] fieldArray = {
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL, EMPTY_CELL_SYMBOL}
        };
        return fieldArray;
    }

    public static char[][] initArray(int areaSize){
        char[][] fieldArray = new char[areaSize][areaSize];
        for (int i = 0; i < fieldArray.length; i++) {
            for (int j = 0; j < fieldArray[i].length; j++) {
                fieldArray[i][j] = EMPTY_CELL_SYMBOL;
            }
        }
        return fieldArray;
    }

}
