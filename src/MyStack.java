import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack<T> implements StackADT<T>
{
    private ArrayList<T> stack;
    public MyStack()
    {
        stack = new ArrayList<T>();
    }

    public void push(T item)
    {
        stack.add(item);
    }

    public T pop()
    {
        if(stack.isEmpty())
            throw new NoSuchElementException();
        else
        {
            T item = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return item;
        }
    }

    public T top()
    {
        if(stack.isEmpty())
            throw new NoSuchElementException();
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