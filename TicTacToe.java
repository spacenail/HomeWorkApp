public class TicTacToe {
   static final char EMPTY_CELL_SYMBOL = '-';

    public static void start(){
        char[][] fieldArray = {
                {EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL},
                {EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL,EMPTY_CELL_SYMBOL}
        };

    }

    public static void drawField(char[][] fieldArray){
        for (int i = 0; i < fieldArray.length; i++) {
            for (int j = 0; j < fieldArray[i].length; j++) {
                System.out.print(fieldArray[i][j] + " ");
            }
        }
    }
}
