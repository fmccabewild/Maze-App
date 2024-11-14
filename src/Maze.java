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
        file = new Scanner(fname);
        int numRows = file.readNext();
        int numCols = file.readNext();
        
        this.maze = new Square[numRows][numCols];
        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numCols; col++)
                maze[row][col] = file.readNext();
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<>();
        neighbors.add(maze[sq.getRow - 1][sq.getCol]);
        neighbors.add(maze[sq.getRow + 1][sq.getCol]);
        neighbors.add(maze[sq.getRow][sq.getCol - 1]);
        neighbors.add(maze[sq.getRow][sq.getCol + 1]);
        for(Square neighbor: neighbors)
        {
            if(neighbor == null)
                neighbors.remove(neighbor);
        }
        return neighbors;
    }

    public Square getStart()
    {
        for(Square [] row: maze)
        {
            for(Square square: row)
            {
                if(square.getType() == 2)
                    return square;
            }
        }
    }

    public Square getFinish()
    {
        for(Square [] row: maze)
        {
            for(Square square: row)
            {
                if(square.getType() == 3)
                    return square;
            }
        }
    }
}