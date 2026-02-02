// resourced ai to fix some syntax errors
// resourced ai to help with some of the counting adjacent mines logic
// used ai to check some of the bounds and conditions to ensure no errors occur during gameplay


import java.util.Random;
import java.util.Scanner;
public class Minesweeper {


    // board size 9x9
    static final int SIZE = 9;

    // number of mines
    static final int MINES = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array that stores the game map with mines and numbers
        char[][] map = new char[SIZE][SIZE];

        // 2D array that stores what the player sees
        char[][] board = new char[SIZE][SIZE];

        generateMap(map);
        initializeBoard(board);

        boolean gameOver = false;

        while (!gameOver) {

            clearScreen();
            printBoard(board);

            System.out.println("\nOptions:");
            System.out.println("r row# col#  -> reveal tile");
            System.out.println("f row# col#  -> flag/unflag tile");
            System.out.println("q          -> quit");

            System.out.print("Enter choice: ");

            char choice = input.next().charAt(0);

            if (choice == 'q') {
                System.out.println("Thanks for playing!");
                break; 
            }
            // read row and column
            int row = input.nextInt();
            int col = input.nextInt();

            // check if the row or column is out of bounds
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("Invalid coordinates.");
                continue; 
            }

           
            if (choice == 'r') {
                if (map[row][col] == 'm') {

                    // reveal the mine
                    board[row][col] = 'm';

                    clearScreen();
                    printBoard(board);

                    System.out.println("\nYou hit a mine. Game over!");
                   
                    // end game if mine is hit
                    gameOver = true;
                } 
                else {
                    // safe tile
                    board[row][col] = map[row][col];

                    // check if the player has won
                    if (checkWin(board, map)) {

                        clearScreen();
                        printBoard(board);

                        System.out.println("\nYou win!");

                        gameOver = true;
                    }
                }
            } 
            // flag or unflag a tile
            else if (choice == 'f') {

                if (board[row][col] == '#') {
                    board[row][col] = 'f';
                } 
              
                else if (board[row][col] == 'f') {
                    board[row][col] = '#';
                }
            }
        }

        input.close();
    }

    // initializes the player's board with hidden tiles
    
    public static void initializeBoard(char[][] board) {
        // loop through each row
        for (int r = 0; r < SIZE; r++) {
            // loop through each column
            for (int c = 0; c < SIZE; c++) {

                // set each tile to hidden
                board[r][c] = '#';
            }
        }
    }

    public static void generateMap(char[][] map) {
        Random rand = new Random();

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                map[r][c] = ' ';
            }
        }
        int placed = 0;
        while (placed < MINES) {

            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            if (map[r][c] != 'm') {

                map[r][c] = 'm';

                placed++;
            }
        }

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                if (map[r][c] != 'm') {
                    // count adjacent mines
                    int count = countAdjacentMines(map, r, c);
                    if (count > 0) {

                        map[r][c] = (char) (count + '0');
                    }
                }
            }
        }
    }

    // counter for nearby mines
    public static int countAdjacentMines(char[][] map, int row, int col) {

        int count = 0;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {

                if (r >= 0 && r < SIZE && c >= 0 && c < SIZE) {

                    if (map[r][c] == 'm') {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void printBoard(char[][] board) {

        System.out.print("  ");
        for (int c = 0; c < SIZE; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int r = 0; r < SIZE; r++) {

            System.out.print(r + " ");

            for (int c = 0; c < SIZE; c++) {
                System.out.print(board[r][c] + " ");
            }

            System.out.println();
        }
    }

    public static boolean checkWin(char[][] board, char[][] map) {

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                if (map[r][c] != 'm' && board[r][c] == '#') {
                    return false;
                }
            }
        }
        return true;
    }
    // method to clear the console screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

