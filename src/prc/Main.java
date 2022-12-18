package prc;

import java.util.Scanner;
import utils.Utils;

public class Main {

    public static void main(String[] args) {
        int fieldSizeRow;
        int fieldSizeColumn;
        String[][] field;

        System.out.print("Please input row size: ");
        Scanner sc = new Scanner(System.in);
        fieldSizeRow = sc.nextInt();
        System.out.print("Please input column size: ");
        fieldSizeColumn = sc.nextInt();

        field = Utils.assignFieldAndMines(fieldSizeRow, fieldSizeColumn);
        Utils.printFieldElems(field, fieldSizeRow, fieldSizeColumn);
    }

}
