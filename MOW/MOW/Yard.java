package MOW;

public class Yard {
    // make the yard private for better encapsulation
    private char[][] yard;

    // constructor: creates a yard with red brick borders and unmowed grass
    public Yard(int lawnHeight, int lawnWidth) {
        int totalHeight = lawnHeight + 2; // add top and bottom border
        int totalWidth = lawnWidth + 2;   // add left and right border
        yard = new char[totalHeight][totalWidth];

        for (int i = 0; i < totalHeight; i++) {
            for (int j = 0; j < totalWidth; j++) {
                if (i == 0 || i == totalHeight - 1 || j == 0 || j == totalWidth - 1) {
                    yard[i][j] = 'R'; // red brick border
                } else {
                    yard[i][j] = '+'; // unmowed grass
                }
            }
        }
    }
    // returns the value at a specific cell
    public char getCell(int row, int col) {
        if (row < 0 || row >= yard.length || col < 0 || col >= yard[0].length) {
            throw new IndexOutOfBoundsException("cell coordinates out of bounds.");
        }
        return yard[row][col];
    }

    // sets the value at a specific cell (e.g., to mow the grass)
    public void setCell(int row, int col, char value) {
        if (row < 0 || row >= yard.length || col < 0 || col >= yard[0].length) {
            throw new IndexOutOfBoundsException("cell coordinates out of bounds.");
        }
        yard[row][col] = value;
    }

    // returns the height of the lawn (without borders)
    public int getLawnHeight() {
        return yard.length - 2;
    }

    // returns the width of the lawn (without borders)
    public int getLawnWidth() {
        return yard[0].length - 2;
    }

    // prints the current state of the yard
    public void printYard() {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }
}