abstract class MazeSolver
{
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    public MazeSolver(Maze maze)
    {
        makeEmpty();
        add(maze.getStart());
    }

    public boolean isSolved()
    {
        
    }

    public String getPath()
    {

    }

    public Square step()
    {

    }

    public void solve()
    {

    }
}