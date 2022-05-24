public class List {
    int length;
    //head -- descritor
    Node start;
    Node end;

    public void addStart(Node e) {
        if (this.start == null) {
            this.start = e;
            this.end = e;
        } else {
            this.start.before = e;
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
            e.before = this.end;
            this.end.next = e;
            this.end = e;
        }
        length++;
    }

    public void showList(Node e, List list) {
        System.out.print(e.data + " ");
        if (e.next != list.start) {
            showList(e.next, list);
        }
    }

    public void showFirstElement(List list) {
        System.out.println(list.start.data);
    }

    public void showLastElement(List list) {
        System.out.println(list.end.data);
    }

    public void printReversed(Node e) {
        System.out.print(e.data + " ");
        if (e.before != null) {
            printReversed(e.before);
        }
    }

    public void removeFromEnd() {
        if (!isEmpty(this.start)) {
            if (this.length == 1) {
                this.start = null;
                this.end = null;
            } else if (this.length == 2) {
                this.start.next = null;
                this.start.before = null;
                this.end = this.start;
            } else {
                removeNode(this.start, this);
            }
            this.length--;
        }
    }

    public void removeFromValue(int value) {
        if (!isEmpty(this.start)) {
            if (this.start.data == value) {
                this.start = this.start.next;
                this.start.before = this.end;
                this.end.next = this.start;
                this.length--;
                return;
            }
            if (this.end.data == value) {
                removeFromEnd();
                return;
            }
            removeNode(this.start, value);
        }
    }

    private void removeNode(Node e, int value) {
        if (e.next.data == value) {
            e.next.next.before = e;
            e.next = e.next.next;
            return;
        }
        removeNode(e.next, value);
    }

    private void removeNode(Node e, List list) {
        if (list.end == e.next) {
            e.next = list.start;
            list.start.before = e;
            list.end = e;
        } else {
            removeNode(e.next, list);
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
