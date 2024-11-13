import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack implements StackADT
{
    private ArrayList<Object> stack;
    public MyStack()
    {
        stack = new ArrayList<Object>();
    }

    public void push(Object item)
    {
        stack.add(item);
    }

    public Object pop()
    {
        if(stack.isEmpty())
            throw new NoSuchElementException;
        else
        {
            Object item = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return item;
        }
    }

    public Object top()
    {
        if(stack.isEmpty())
            throw new NoSuchElementException;
        else
        {
            return stack.get(stack.size()-1);
        }
    }

    public int size()
    {
        return stack.size();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void clear()
    {
        while(!stack.isEmpty())
            stack.remove(0);
        
    }
}