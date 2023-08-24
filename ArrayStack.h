import java.io.*;
import java.util.*;

public class ArrayStack<T> implements Stack.h {

    ArrayStack<T> A;

    int top = -1;

    int size;

    ArrayStack(int size){
        this.size = size;

        this.A = new ArrayList<T>(size);
    }

    void push(T X){
        if (top + 1 == size){
            System.out.println("Array full")
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
            System.out.println("Stack is empty.")

            return null;
        }
        else{
            return A.get(top);
        }
    }

    T pop{
        if(top == -1){
            System.out.println("Stack is empty.")
        }
        else{
            A.move()
            top--;
        }

    }

    void move(){
        for(int i = 0; i < A.length-1; i++){
            A[i] = A[i+1];
        }
    }

    bool isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }



















}