

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
        this.length++;
    }

    public void addEnd(Node e) {
        if (this.start == null) {
            this.start = e;
            this.end = e;
        } else {
            this.end.next = e;
            this.end = e;
        }
        this.length++;
    }

    public void print(Node e) {
        if (!isEmpty(e)) {
            System.out.print(e.value + " ");
            if (e.next != null) {
                print(e.next);
            }
        }
    }

    public void printFirstElement() {
        if (!isEmpty(this.start)) {
            System.out.println(this.start.value);
        }
    }

    public void printLastElement() {
        if (!isEmpty(this.start)) {
            System.out.println(this.end.value);
        }
    }

    public void printReversed() {
        if (!isEmpty(this.start)) {
            printNodes(this.start);
        }
    }

    private void printNodes(Node e) {
        if (e.next == null) {
            System.out.print(e.value + " ");
            return;
        }
        printNodes(e.next);
        System.out.print(e.value + " ");
    }

    public void removeFromStart() {
        if (!isEmpty(this.start)) {
            this.start = this.start.next;
            this.length--;
        }
    }

    public void removeFromEnd() {
        if (!isEmpty(this.start)) {
            if (this.length == 1) {
                this.start = null;
                this.end = null;
            } else if (this.length == 2) {
                this.start.next = null;
                this.end = this.start;
            } else {
                removeNode(this.start, this);
            }
            this.length--;
        }
    }

    public void removeFromValue(String value) {
        if (!isEmpty(this.start)) {
            if (this.start.value.equals(value)) {
                this.start = this.start.next;
                this.length--;
                return;
            }

            if (this.end.value.equals(value)) {
                removeFromEnd();
                return;
            }

            removeNode(this.start, value);
        }
    }
    
    public void removeFromPosition(int position) {
        if(!isEmpty(this.start)) {
            if (position > length) {
                System.out.println("Index out of bounds, please insert a valid value");
            }
            if (position == 1) {
                this.start = this.start.next;
                length--;
            }
            if (position == length) {
                removeFromEnd();
            }
            removeNode(this.start, position, 1);
        }
    }
    
    private void removeNode(Node e, int position, int counter) {
        if (position == counter + 1) {
            if (e.next.next == null) {
                e.next = null;
                return;
            }
            e.next = e.next.next;
            length--;
        } else {
            counter++;
            removeNode(e.next, position, counter);
        }
    }

    private void removeNode(Node e, List list) {
        if (list.end == e.next) {
            e.next = null;
            list.end = e;
        } else {
            removeNode(e.next, list);
        }
    }

    private void removeNode(Node e, String value) {
        if (e.next.value.equals(value)) {
            e.next = e.next.next;
            return;
        }
        removeNode(e.next, value);

    }

    private void removeAllNodes(Node e, String value) {
        if (e.next != null) {
            if (e.next.value.equals(value)) {
                if (e.next.next == null) {
                    e.next = null;
                    this.end = e;
                    return;
                }
                e.next = e.next.next;
                removeAllNodes(e, value);
            }
            removeAllNodes(e.next, value);
        }
    }

    public void removeAllFromValue(String value) {
        removeAllNodes(this.start, value);
        if (this.start.value.equals(value)) {
            this.start = this.start.next;
        }
    }

    public void search(String value) {
        if (!isEmpty(this.start)) {
            searchNode(this.start,value);
        }
    }

    public void searchMatches(String value) {
        if (!isEmpty(this.start)) {
            countNode(this.start, value, 0);
        }
    }

    private void searchNode(Node e, String value) {
        if (e.next == null) {
            System.out.println("This list doesn't contain this value");
            return;
        }
        if (e.value.equals(value)) {
            System.out.println(e.toString());
        } else {
            searchNode(e.next, value);
        }
    }

    private void countNode(Node e, String value, int counter) {
        if (e.value.equals(value)) {
            counter++;
        }
        if (e.next == null) {
            System.out.println("NUMBER OF MATCHES FOR '" + value + "': " + counter);
            return;
        }
        countNode(e.next, value, counter);
    }

    public boolean isEmpty(Node e) {
        if (e == null) {
            System.out.println("Your list is empty.");
            return true;
        }

        return false;
    }
}
