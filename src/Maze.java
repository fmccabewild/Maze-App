import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class Maze
{
    private Square [][] maze;
    private Scanner file;
    private String name;

    public Maze()
    {

    }

    public boolean loadMaze(String fname)
    {   
        boolean loaded = true;
        name = fname;
        File f = new File(fname);
        try 
            {
                file = new Scanner(f);
            }
        catch(Exception FileNotFoundException)
            {
                loaded = false;
            }
        int numRows = Integer.parseInt(file.next());
        int numCols = Integer.parseInt(file.next());
        
        this.maze = new Square[numRows][numCols];
        for (int row = 0; row < numRows; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                Square sq = new Square(row, col, Integer.parseInt(file.next()));
                maze[row][col] = sq;
            }
        }
        return loaded;
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<>();
        try{neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);}catch(Exception IndexOutOfBoundsException){}
        try{neighbors.add(maze[sq.getRow() + 1][sq.getCol()]);}catch(Exception IndexOutOfBoundsException){}
        try{neighbors.add(maze[sq.getRow()][sq.getCol() - 1]);}catch(Exception IndexOutOfBoundsException){}
        try{neighbors.add(maze[sq.getRow()][sq.getCol() + 1]);}catch(Exception IndexOutOfBoundsException){}
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
        return null;
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
        return null;
    }

    public void reset()
    {
        this.loadMaze(name);
    }

    public String toString()
    {
        String mazeToString = "";
        for(Square [] row: maze)
        {
            for(Square col: row)
            {
                mazeToString += (col.toString());
            }
            mazeToString += ("\n");
        }
        return mazeToString;
    }
}