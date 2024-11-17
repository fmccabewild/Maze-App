import java.util.ArrayLists;

abstract class MazeSolver
{
    private boolean isSolved = false;
    private Maze maze;
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    public MazeSolver(Maze maze)
    {
        makeEmpty();
        this.maze = maze;
    }

    public boolean isSolved()
    {
        return isSolved;
    }

    public String getPath()
    {
        if(isSolved)
        {
            String string;
            ArrayList<Square> path = new ArrayList<>();
            Square sq = maze.getFinish();
            while(sq != null)
            {
                path.add(0, sq);
                sq = sq.previous;
            }
            for(Square sq: path)
            {
                string.add("[" + sq.getRow() + ", " + sq.getCol() + "] ")
            }
            return string;
        }
        else
            return "No solution."
    }

    public Square step()
    {
        if(isEmpty())
            return null;
        else
        {
            Square nextSquare = next();
            if(nextSquare.getType() == 3)
                return nextSquare;
            Square [] neighbors = maze.getNeighbors(nextSquare);
            for(Square sq: neighbors)
            {
                if(sq.previous == null && sq != maze.getStart())
                    add(sq);
                    sq.previous = nextSquare;
            }
            return nextSquare;
        }
    }

    public void solve()
    {
        add(maze.getStart());
        while(!(isEmpty))
        {
            Square sq = next();
            if(sq == maze.getFinish())
                isSolved == true;
                break;
        }
    }
}