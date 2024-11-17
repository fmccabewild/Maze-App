public class MazeSolverStack implements MazeSolver
{
    private MyStack stack;
    public MazeSolverStack(Maze maze)
    {
        super(maze);
    }

    @Override
    public void makeEmpty()
    {
        stack = new MyStack();
    }

    @Override
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    @Override
    public void add(Square sq)
    {
        stack.push(sq);
    }

    @Override
    public Square next()
    {
        return stack.pop();
    }
}