public class MazeSolverQueue implements MazeSolver
{
    private MyQueue queue;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
    }

    @Override
    public void makeEmpty()
    {
        queue = new MyStack();
    }

    @Override
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    @Override
    public void add(Square sq)
    {
        queue.add(sq);
    }

    @Override
    public Square next()
    {
        return queue.remove();
    }
}