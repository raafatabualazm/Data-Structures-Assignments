package com.raafat;

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
    static void swap(LinkedList L, int i, int j) {
        int counter1 =0;
        int counter2 =0;
        Link curr = L.getFirst();
        int temp;
        Link temp1 = null;
        Link temp2 = null;
        while (curr != null) {
            if (counter1 == i) {
                temp1 = curr;
            }
            if (counter2 == j) {
                temp2 = curr;
            }
            curr = curr.next;
            counter1++;
            counter2++;
        }
        temp = temp1.getData();
        temp1.setData(temp2.getData());
        temp2.setData(temp);
    }
    void disPlayList() {
        Link curr = first;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
