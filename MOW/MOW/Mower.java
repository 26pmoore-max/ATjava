package MOW;

import java.util.Random;

public class Mower {

    private int row;
    private int col;
    private int direction; 
    // 0 = up, 1 = right, 2 = down, 3 = left

    // constructor
    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    // getters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getDirection() {
        return direction;
    }

    // setters
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    // move forward
    public void moveForward() {
        if (direction == 0) row--;
        else if (direction == 1) col++;
        else if (direction == 2) row++;
        else if (direction == 3) col--;
    }

    // turn left
    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    // turn right
    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    // sense what's in front
    public char senseFront(Yard yard) {
        int nextRow = row;
        int nextCol = col;

        if (direction == 0) nextRow--;
        else if (direction == 1) nextCol++;
        else if (direction == 2) nextRow++;
        else if (direction == 3) nextCol--;

        return yard.getCell(nextRow, nextCol);
    }

    // cut grass
    public void cutGrass(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    // randomize starting position
    public void randomizeStart(Yard yard) {

        Random rand = new Random();

        int height = yard.getLawnHeight();
        int width = yard.getLawnWidth();

        int corner = rand.nextInt(4);

        if (corner == 0) {
            row = 1;
            col = 1;
        }
        else if (corner == 1) {
            row = 1;
            col = width;
        }
        else if (corner == 2) {
            row = height;
            col = width;
        }
        else {
            row = height;
            col = 1;
        }

        // random direction
        direction = rand.nextInt(4);
    }

    // update mower movement (spiral)
    public boolean updateMower(Yard yard) {

        cutGrass(yard);

        // forward
        if (senseFront(yard) == '+') {
            moveForward();
            return true;
        }

        // right
        turnRight();
        if (senseFront(yard) == '+') {
            moveForward();
            return true;
        }

        // left
        turnLeft();
        turnLeft();
        if (senseFront(yard) == '+') {
            moveForward();
            return true;
        }

        // reset direction
        turnRight();

        // no moves left
        return false;
    }
}