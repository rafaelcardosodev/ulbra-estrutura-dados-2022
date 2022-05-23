import java.util.Arrays;

public class Pilha {

    private int top;
    private Object[] array;

    public Pilha(int t){
        array = new Object[t];
        top = -1;
    }

    public boolean push(int e){
        if (isFull()) {
            return false;
        }
        top++;
        array[top] = e;
        return true;
    }

    public boolean pop(){
        if (!isEmpty()) {
            top--;
            return true;
        }

        return false;
    }

    public int size(){
        return array.length;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }

        return false;
    }

    public boolean isFull(){
        if (size() == top + 1) {
            return true;
        }

        return false;
    }

    public Object top(){
        if (!isEmpty()) {
            return array[top];
        }

        return -1;
    }

    public void print() {
        Arrays.stream(array).forEach(System.out::println);
    }
}
