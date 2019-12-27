package Source;

public class LinkedList {
    Link first;
    Link last;

    public Link getFirst() {
        return first;
    }

    Boolean isEmpty() {
        return (first == null);
    }
    void insertFirst(int data) {
        Link temp = new Link(data);
        temp.next = first;
        if (first != null) first.prev = temp;
        first = temp;
        if (last == null) last = temp;
    }
    void insertLast(int data) {
        Link temp = new Link(data);
        if (last != null) last.next = temp;
        temp.prev = last;
        last = temp;
        if (first == null) first = temp;
    }
    void put(int pos, int data) {
        int counter = 0;
        Link curr = first;
        if (pos == 0) {
            insertFirst(data);
            return;
        }
        if (first == null) {
            insertFirst(data);
            return;
        }
        while (counter < pos && curr.next != null) {
            curr = curr.next;
            counter++;
        }
        if (curr.next == null) {
            insertLast(data);
            return;
        }
        Link temp = new Link(data);
        curr.prev.next = temp;
        temp.next = curr;
        curr.prev = temp;
    }
    void displayList() {
        Link curr = first;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    void RotateLeft() {
        last.next = first;
        first.prev = last;
        last = first;
        first = first.next;
        first.prev = null;
        last.next = null;
    }
}
