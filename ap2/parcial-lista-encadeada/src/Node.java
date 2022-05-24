import java.util.Objects;

public class Node {

    String value;

    Node next;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node {" +
                "value='" + this.value + '\'' +
                ", next = " + this.next.value +
                '}';
    }
}
