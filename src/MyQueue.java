import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue implements QueueADT
{
    private ArrayList<Object> queue;

    public MyQueue()
    {
        queue = new ArrayList<>();
    }

    public void enqueue(Object item)
    {
        queue.add(item);
    }

    public Object dequeue()
    {
        if(queue.isEmpty())
            throw new NoSuchElementException;
        else
        {
            Object item = queue.get(0);
            queue.remove(0);
            return item;
        }
    }

    public Object front()
    {
        if(queue.isEmpty())
            throw new NoSuchElementException;
        else
        {
            return queue.get(0);
        }
    }

    public int size()
    {
        return queue.size();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public void clear()
    {
        while(!queue.isEmpty())
            queue.remove(0);
    }
}