import java.util.*;

public class ArrayQueue<T> {

    ArrayList<T> A;

    private int first;
    private int last;
    private int size;

    public ArrayQueue(int cap) {
        size = 0;
        first = 0;
        last = -1;

        A = new ArrayList<T>(cap);
    }

    boolean isFull(){
        return last == size;
    }

    void enqueue(T X){
        if (isFull()){
            System.out.println("Queue is full.");
            //System.out.println("last: "+last);
            //System.out.println("list size: "+size);
        }
        else{
            last++;
            A.add(X);
            size++;
        }

    }

    T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        else{
            T removed = peek();
            //A.remove(first);
            first++;
            size--;
            return removed;
        }
    }

    T peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        else {
            return A.get(first);
        }
    }

    boolean isEmpty(){
        return first > last;
    }

    public int size() {
        return A.size();
    }

    public String toString(){
        String Ans = "";
        if(isEmpty()){
            return "Queue is empty.";
        }

        for (int i = first; i <= last; i++){
            Ans += String.valueOf(A.get(i)) + ", ";
        }


        return Ans;
    }
}
