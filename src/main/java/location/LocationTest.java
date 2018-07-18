package location;

import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j]= scanner.nextInt();

            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        Location location = new Location(row,column);

        System.out.println("A matrix has "+location.display());
        System.out.println("Max value = "+location.locateLargest());
    }
}
