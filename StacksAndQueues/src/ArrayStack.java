import java.util.*;

public class ArrayStack<T> {

    ArrayList<T> A;

    int top = -1;

    int size;

    public ArrayStack(int size){
        this.size = size;

        this.A = new ArrayList<T>(size);
    }

    void push(T X){
        if (top + 1 == size){
            System.out.println("Array full");
        }
        else {
            top = top + 1;

            if(A.size() > top){
                A.set(top, X);
            }
            else{
                A.add(X);
            }
        }
    }

    T peek(){
        if (top == -1) {
            System.out.println("Stack is empty.");

            return null;
        }
        else{
            return A.get(top);
        }
    }

    T pop(){
        if(top == -1){
            System.out.println("Stack is empty.");
            return null;
        }
        else{
            T popped = A.get(top);
            top--;
            return popped;
        }

    }

    boolean isEmpty(){
        return top == -1;
    }

    public int size() {
        return A.size();
    }

    public String toString(){
        String Ans = "";



        for (int i = 0; i < top; i++){
            Ans += String.valueOf(A.get(i)) + ", ";
        }

        if (top >= 0) {
            Ans += String.valueOf(A.get(top));
        }


        return Ans;

    }
}