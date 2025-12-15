package gol;

public class GameOfLife implements Board {
    private int[][] grid;
    
    public GameOfLife(int rows, int cols) {
        grid = new int[rows][cols];
    }
    
    public void set(int r, int c, int[][] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[0].length; j++) {
                grid[(i + r) % grid.length][(j + c) % grid[0].length] = pattern[i][j];
            }
        }
    }
  // Run the simulation for a number of turns
    public void run(int turns) {
        // call step the number of times requested
        for (int i = 0; i < turns; i++) {
            step();
        }
    }

    // Step the simulation forward one turn.
    public void step()
    {
        print();
        // Update the game board, store a 1 if the cell is alive and a 0 otherwise.
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] nextGrid = new int[rows][cols];
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int count = countNeighbors(r, c);
                int cell = grid[r][c];
                
                if (cell == 1) {
                    nextGrid[r][c] = (count == 2 || count == 3) ? 1 : 0;
                } else {
                    nextGrid[r][c] = (count == 3) ? 1 : 0;
                }
            }
        }
        grid = nextGrid;
    }

public int countNeighbors(int x, int y) {
        int count = 0;
        // count the number of neighbors the cell has
        // use the get(x,y) method to read any board state you need.
        count = get(x - 1, y - 1) + get(x, y - 1) + get(x + 1, y - 1) +
                get(x - 1, y) + get(x + 1, y) +
                get(x - 1, y + 1) + get(x, y + 1) + get(x + 1, y + 1);
        return count;
    }

    // Get a value from the board with "wrap around"
    // Locations outside the board will loop back into the board.
    // Ex: -1 will read board.length-1
    public int get(int x, int y) {
        int xLimit = grid.length;
        int yLimit = grid[0].length;
        return grid[(x+xLimit)%xLimit][(y+yLimit)%yLimit];
    }

    // Test helper to get the whole board state
    public int[][] get()
    {
        return board;
    }

    // Test helper to print the current state
    public void print(){
        // Print the header
        System.out.print("\n ");
        for (int y = 0; y < board[0].length; y++) {
            System.out.print(y%10 + " ");
        }

        for (int x = 0; x < board.length; x++) {
            System.out.print("\n" + x%10);
            for (int y=0; y<board[x].length; y++)
            {
                if (board[x][y] == 1)
                {
                    System.out.print("⬛");
                }
                else
                {
                    System.out.print("⬜");
                }
            }
        }
        System.out.println();
    }
}
