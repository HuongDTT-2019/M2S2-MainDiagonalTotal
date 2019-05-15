import java.util.Scanner;

public class mainDiagonalTotal {
    public static void main(String[] args) {
        int[][] array;
        int row;
        int column;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of row matrix:");
        row = input.nextInt();

        System.out.println("Enter the size of column matrix:");
        column = input.nextInt();

        array = new int[row][column];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");
        insertValue(array, row, column);
        System.out.println("Matrix:");
        displayArray(array, row, column);
        System.out.println("Sum main diagonal: "+(mainDiagonalSum(array, row, column)));

    }

    public static void insertValue(int[][] array, int row, int column) {
        Scanner input = new Scanner(System.in);
        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                System.out.printf("Enter element [%d][%d]:", row, column);
                int value = input.nextInt();
                array[row][column] = value;
            }
        }
    }

    public static void displayArray(int[][] array, int row, int column) {
        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int mainDiagonalSum(int[][] array, int row, int column) {
        int sum = 0;
        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                if (row == column) {
                    sum = sum + array[row][column];
                }
            }
        }
        return sum;
    }
}
