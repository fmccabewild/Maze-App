import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private ArrayList<T> queue;

    public MyQueue()
    {
        queue = new ArrayList<>();
    }

    public void enqueue(T item)
    {
        queue.add(item);
    }

    public T dequeue()
    {
        if(queue.isEmpty())
            throw new NoSuchElementException();
        else
        {
            T item = queue.get(0);
            queue.remove(0);
            return item;
        }
    }

    public T front()
    {
        if(queue.isEmpty())
            throw new NoSuchElementException();
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