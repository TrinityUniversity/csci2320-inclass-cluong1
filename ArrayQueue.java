import java.util.*;

public class ArrayQueue<T> {

    ArrayList<T> A;

    int first = -1;
    int last = -1;

    int size;

    ArrayQueue(int size) {
        this.size = size;

        this.A = new ArrayList<T>(size);
    }

    void enqueue(T X){
        if (first > last){
            System.out.println("Queue is full.");
        }
        else{
            last = last+1;
            A.add(X);
        }

    }

    T dequeue(){
        if(first > last){
            System.out.println("Queue is empty.");
            return null;
        }
        else{

            first = first+1;
        }
        return A.get(first);
    }

    T peek(){
        if(first == -1){
            System.out.println("Stack is empty.");
            return null;
        }
        else {
            return A.get(first);
        }
    }

    boolean isEmpty(){
        return (first == -1 && last == -1) || (first > last);
    }

    public int size() {
        return A.size();
    }

    public String toString(){
        String Ans = "";

        for (int i = 0; i < last; i++){
            Ans += String.valueOf(A.get(i)) + ", ";
        }

        Ans += String.valueOf(A.get(last));

        return Ans;
    }
}
