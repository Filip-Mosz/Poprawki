import java.util.Arrays;

public class MyStack<T> {
    int size;
    T[] stackArray;


    public MyStack() {
        this.stackArray = (T[]) new Object[10];
        this.size = 0;
    }

    public void push(T obj) {
        if (size == 9) {
            doubleTheSize();
        }

        this.stackArray[size] = obj;
        this.size++;
    }

    public Object pop() throws MyStackException {


        if (size != 0) {
            size--;
            return stackArray[size];
        } else throw new MyStackException();
    }

    public Object peek() {
        return stackArray[size];
    }

    @Override
    public String toString() {
        return "MyStack{}";
    }

    private void doubleTheSize() {
        //Object[] copy = new Object[stackArray.length];
        int currentLength = this.stackArray.length;
        this.stackArray = Arrays.copyOf(stackArray, currentLength * 2);
    }

    public int getSize() {
        return size;
    }
}
