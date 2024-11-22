public class MazeSolverStack extends MazeSolver
{
    private MyStack<Square> stack;
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