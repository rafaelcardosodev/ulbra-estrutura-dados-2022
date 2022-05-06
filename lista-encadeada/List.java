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

    public void showList(Node e) {
        System.out.print(e.data + " ");
        if (e.next != null) {
            showList(e.next);
        }
    }

    public void showFirstElement(List list) {
        System.out.println(list.start.data);
    }

    public void showLastElement(List list) {
        System.out.println(list.end.data);
    }
}
