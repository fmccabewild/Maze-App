import java.util.Scanner;
public class Maze
{
    private Square [][] maze;
    private Scanner file;
    public Maze()
    {

    }

    public boolean loadMaze(String fname)
    {   
        file = 
        this.maze = new Square[numRows][numCols];

        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numCols; col++)
                maze[row][col] = null;
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        
    }
}