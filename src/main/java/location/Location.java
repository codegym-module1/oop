package location;

public class Location {
    int row;
    int column;

    public Location() {
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String display() {
        return row + " row and " + column + " column";
    }

    public int[] locateLargest() {
        int[][] a = new int[row][column];
        int[] location = new int[]{0, 0};
        int maxValue = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
