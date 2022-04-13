import java.util.Arrays;

public class Fila {

    private int size;
    private int first;
    private int[] array;

    public Fila(int t) {
        array = new int[t];
        first = -1;
    }

    public boolean add(int e){
        if (isFull()) {
            return false;
        }
        first++;
        array[first] = e;
        return true;
    }

    public void remove(){
        for (int i = 0; i < size(); i++) {
            if (i+1 == size()) {
                array[i] = 0;
                break;
            }
            array[i] = array[i+1];
        }
        first--;
    }

    public void show(){
        System.out.print("{ ");
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.print("}");
    }

    public int size(){
        return array.length;
    }

    public boolean isFull(){
        if (size() == first + 1) {
            return true;
        }

        return false;
    }

}
