import com.sun.istack.internal.Nullable;

public class List {
    int length;
    Node start;
    Node end;

    public void addStart(Node e) {
        if (this.start == null) {
            this.start = e;
            this.end = e;
        } else {
            e.next = this.start;
            this.start = e;
        }
        length++;
    }

    public void addEnd(Node e) {
        if (this.start == null) {
            this.start = e;
            this.end = e;
        } else {
            this.end.next = e;
            this.end = e;
        }
        length++;
    }

    public void print(Node e) {
        if (!isEmpty(e)) {
            System.out.print(e.value + " ");
            if (e.next != null) {
                print(e.next);
            }
        }
    }

    public void printFirstElement(List list) {
        if (!isEmpty(list.start)) {
            System.out.println(list.start.value);
        }
    }

    public void printLastElement(List list) {
        if (!isEmpty(list.start)) {
            System.out.println(list.end.value);
        }
    }

    public void removeFromStart(List list) {
        if (!isEmpty(list.start)) {
            list.start = list.start.next;
            length--;
        }
    }

    public void removeFromEnding(List list) {
        if (!isEmpty(list.start)) {
            if (list.length == 1) {
                list.start = null;
                list.end = null;
            } else if (list.length == 2) {
                this.start.next = null;
                this.end = this.start;
            } else {
                list.end = checkNode(list.start, list);
            }
            length--;
        }
    }

    public void removeFromValue(List list, String value) {
        if (!isEmpty(list.start)) {
            if (list.start.value.equals(value)) {
                list.start = list.start.next;
                length--;
                return;
            }

            if (list.end.value.equals(value)) {
                removeFromEnding(list);
                return;
            }

            checkNode(list.start, value);
        }
    }

    private Node checkNode(Node e, List list) {
        if (list.end == e.next) {
            e.next = null;
            return e;
        } else {
            checkNode(e.next, list);
            return null;
        }
    }

    private void checkNode(Node e, String value) {
        if (e.next.value.equals(value)) {
            e.next = e.next.next;
            return;
        } else {
            checkNode(e.next, value);
        }
    }

    public boolean isEmpty(Node e) {
        if (e == null) {
            System.out.println("Your list is empty.");
            return true;
        }

        return false;
    }
}
