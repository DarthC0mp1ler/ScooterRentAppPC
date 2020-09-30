package Implementation.Memory.Queue;

import Implementation.Logic.Models.Contract;

import java.util.PriorityQueue;
import java.util.Queue;

public class TSQueue<T extends Contract> {

    private Queue<T> _queue;

    public TSQueue(){
        _queue = new PriorityQueue<>();
    }

    public synchronized void add(T element){
        _queue.add(element);
    }

    public synchronized T peek(){
        return _queue.peek();
    }

    public synchronized T poll(){
        return  _queue.poll();
    }

}
