package utils;

import java.util.Random;

public class Utils {
    public static String[][] assignFieldAndMines(int row, int column) {
        int indexColumn = 0;
        int indexRow = 0;
        int mineCount = (row * column) / 4;
        Random rand = new Random();
        String[][] field = new String[row][column];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "-";
            }
        }

        for (int a = 0; a < mineCount;) {
            indexColumn = rand.nextInt(column);
            if ("-".equals(field[indexRow][indexColumn])) {
                field[indexRow][indexColumn] = "*";
                indexRow++;
                a++;
                if (indexRow == row) {
                    indexRow = 0;
                }
            }
        }
        return field;
    }
    
    public static void printFieldElems(String[][] field, int row, int column) {
        System.out.println("\nNumber of mines: "+(row * column) / 4 + " - ("+row+"*"+column+" / 4)");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
